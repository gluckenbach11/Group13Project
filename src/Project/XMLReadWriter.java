/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.beans.*;
import java.io.*;

/**
 *
 * @author gluck
 */
public class XMLReadWriter 
{
    XMLEncoder xe;
    XMLDecoder xd;
    public XMLReadWriter()
    {
        
    }
    
    public void writeXML(PlayerScore playerScore)
    {
        try
        {
            xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("PlayerScores.xml")));
            xe.writeObject(playerScore);
            xe.close();
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public void openXMLReader()
    {
        try
        {
            xd = new XMLDecoder(new BufferedInputStream(new FileInputStream("PlayerScores.xml")));
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public Object readXML()
    {
        Object o = new Object();
        try
        {
            o = xd.readObject();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return o;
    }
    
    public void closeXML()
    {
        xd.close();
    }
}
