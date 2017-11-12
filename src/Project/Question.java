/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author gluck
 */
public class Question 
{
    String query;
    String answer;
    
    public Question()
    {
        query = null;
        answer = null;
    }
    
    public Question(String query, String answer)
    {
        this.query = query;
        this.answer = answer;
    }
}
