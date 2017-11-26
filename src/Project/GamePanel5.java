/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class GamePanel5 extends JPanel
{
    ArrayList<Question> questionList; 
    boolean correct = false;
    JLabel lblQuestion;
    JLabel lblResult;
    JLabel lblAnswer;
    JTextField tfInputAnswer;
    JButton btnCheck;
    JButton btnNext;
    int questionIndex;
    int score;
    
    GamePanel5()
    {
        questionList = new ArrayList<>();
        addQuestions();
        tfInputAnswer = new JTextField();
        btnNext = new JButton("Next");
        btnCheck = new JButton("Check Answer");
        lblAnswer = new JLabel("Answer: ");
        setLayout(null);
        setBackground(Color.yellow);
        setVisible(true);
        lblQuestion = new JLabel(questionList.get(questionIndex).query);
        lblResult = new JLabel();
        
        lblQuestion.setBounds(100, 100, 300, 30);
        lblAnswer.setBounds(100, 150, 100, 30);
        tfInputAnswer.setBounds(250, 150, 200, 30);
        btnCheck.setBounds(100, 200, 150, 30);
        btnNext.setBounds(275, 200, 100, 30);
        lblResult.setBounds(100, 250, 100, 30);
        
        add(lblQuestion);
        add(lblAnswer);
        add(tfInputAnswer);
        add(btnCheck);
        add(btnNext);
        add(lblResult);
        
        btnNext.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                tfInputAnswer.setEditable(true);
                lblResult.setText(null);
                tfInputAnswer.setText(null);
                btnCheck.setVisible(true);
                questionIndex++;
                if (questionIndex < questionList.size())
                {
                    lblQuestion.setText(questionList.get(questionIndex).query);
                }
                else
                {
                    lblQuestion.setText("That's all she wrote...");
                    remove(lblAnswer);
                    remove(tfInputAnswer);
                    remove(btnCheck);
                    remove(btnNext);
                    remove(lblResult);
                }
            }            
        });
        
        btnCheck.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkAnswer())
                {
                    lblResult.setText("Correct");
                    score++;
                }
                else
                {
                    lblResult.setText("Not even close");
                }
                repaint();
                tfInputAnswer.setEditable(false);
            }
            
        });
    }
    
    public void addQuestions()
    {
        questionList.add(new Question("What color are leaves?", "green"));
        questionList.add(new Question("How many molecules are in a mole?", "6.02 x 10^23"));
    }
    
    public boolean checkAnswer()
    {
        if (questionList.get(questionIndex).answer.equalsIgnoreCase(tfInputAnswer.getText()))
        {
            correct = true;
        }
        else
        {
            correct = false;
        }
        return correct;
    }
}
