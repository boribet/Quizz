/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.sql.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import static quizz.QuestionsQuizz.answers;
import static quizz.QuestionsQuizz.questions;
/**
 *
 * @author margaridaferreira
 */
public class Quizzmain {
    
    //public Quizzmain() throws IOException{
    public static void main(String[] args) throws IOException {
        try
    {
        System.out.println("Driver Loaded");
        
        //Connection conn = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8166215","sql8166215","rins6mGcbF");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql8166215","root","UsUvji:yZ0&E");
        //Database Name - testDB, Username - "root", Password - ""
        
        System.out.println("Connected...");         
    } catch(SQLException e) {
        System.err.println(e);
    }

        
        /*
        Scanner scan = new Scanner(System.in);
        
        int actualscore, actualfailed, actualskipped, actualcheated;
        actualscore=0;
        actualfailed=0;
        actualskipped=0;
        actualcheated=0;

      QuestionsQuizz q =new QuestionsQuizz();
      q.read_answers("capitals.txt");
      QuestionsQuizz a =new QuestionsQuizz();
      a.read_questions("questions.txt");
      
        
        for (int index =0; index<questions.length; index++)
        {
        System.out.println(questions[index]);
        System.out.println("To submit your answer just write it down and press enter");
        System.out.println("To cheat press C");
        System.out.println("To skip question press S");
        System.out.println("To exit press E");

        String action= scan.next();
        
        if ((action.equalsIgnoreCase("C"))||(action.equalsIgnoreCase("S"))||(action.equalsIgnoreCase("E")))
                {
        switch(action)
        { 
            
            case ("c"):
            case ("C"):
                actualcheated++;
                System.out.println(answers[index]);
                break;
            case ("s"):    
            case ("S"):
                actualskipped++;
                break;
            case ("e"):    
            case ("E"):
                index=questions.length;
        }
                }
        
        else if((action.equalsIgnoreCase(answers[index])))
        actualscore++;
        
        else
            actualfailed++;
        
        }
               System.out.print("You scored "+actualscore+" "); 
        if (actualscore==1)
            System.out.println("point");
        else            
            System.out.println("points");
        
        System.out.print("The computer scored "+actualscore+" ");
        if (actualscore==1)
            System.out.println("point");
        else            
            System.out.println("points");
        
        System.out.print("You falied "+actualfailed+" ");
        if (actualfailed==1)
            System.out.println("question");
        else            
            System.out.println("questions");
        
        System.out.print("You skipped "+actualskipped+" ");
        if (actualskipped==1)
            System.out.println("question");
        else            
            System.out.println("questions");
        
        System.out.print("You cheated "+actualcheated+" ");
        if (actualcheated==1)
            System.out.println("question");
        else            
            System.out.println("questions");
        
        if(actualscore>actualscore)
            System.out.println("You win!");
        else if (actualscore==actualscore)
            System.out.println("It's a tie");
        else
            System.out.println("The computer wins!");
         */       
        }
                
        }
