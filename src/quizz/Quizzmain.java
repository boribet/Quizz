/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author zceibet
 */
public class Quizzmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        int actualscore;
        actualscore=0;
        
        String[] questions = {"Capital of Portugal?","Capital of Hungary?","Capital of USA?"};
        String[] answers = {"Lisbon","Budapest", "Washington"};
        
        
        for(int index=0; index<questions.length; index++)
        {
        System.out.println(questions[index]);
        System.out.println("To cheat press C");
        System.out.println("To skip question press S");
        System.out.println("To exit press E");

        String action= scan.next();
        
        if ((action.equals("C"))||(action.equals("S"))||(action.equals("E")))
                {
        switch(action)
        { 
            case ("C"):
                System.out.println(answers[index]);
                break;
            case ("S"):
                break;
            case ("E"):
                index=questions.length;
        }
                }
        
        else if((action.equalsIgnoreCase(answers[index])))
        actualscore++;
        
        
        }
        scores.add(actualscore);
        System.out.println(scores);            
        }
        
        
        
    }
    

