/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static quizz.QuestionsQuizz.answers;
import static quizz.QuestionsQuizz.questions;
/**
 *
 * @author margaridaferreira
 */
public class Quizzmain {
    
    public Quizzmain(String player) throws IOException{
    //public static void main(String[] args) throws IOException {
       Scanner read = null;
        try{
            read = new Scanner (new FileInputStream("logindetails.txt"));

        }

        catch (FileNotFoundException ex){
            Logger.getLogger(LoginFileCheck.class.getName()).log(Level.SEVERE, null, ex);

        }
        ArrayList<String> scores = new ArrayList<String>();
        ArrayList<String> scoresSeparate = new ArrayList<String>();
        String [] gamma = null;
        ArrayList<String> allusers = new ArrayList<String>();
        
        ArrayList<String> scoresO = new ArrayList<String>();
        ArrayList<String> usernames = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        ArrayList<String> allusersO = new ArrayList<String>();
  
        
        //reading in the file bu only using the scores to create a local variable list of scores
                    for(int i = 0; read.hasNextLine();i++)
            {
                allusers.add(read.nextLine()); 
            }
                
            
            for(int j = 0; j<allusers.size() ; j++)
           {    

                String [] alfa = allusers.get(j).split(",");
                usernames.add(alfa[0]);
                scores.add(alfa[2]);
                
                
                if(player.equals(usernames.get(j)))
                {
                gamma = scores.get(j).split("/");
                
                    for(int i=0; i<gamma.length; i++)
                    {
                        scoresSeparate.add(gamma[i]);
                    }
                }
           }
            
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

         
        String d = Integer.toString(actualscore);
        scores.add(d);
        ScoreOrd beta = new ScoreOrd(scores);
        
        //the part after here is just writing out the scores as they are now unfortunately we have to read in again
        //as i was unable to return more tan one arraylist from a method, so i could write one that does this
        
         for(int i = 0; read.hasNextLine();i++)
            {
                allusers.add(read.nextLine()); 
            }
                
            
            for(int j = 0; j<allusers.size() ; j++)
           {    

                String [] alfa = allusers.get(j).split(",");
                usernames.add(alfa[0]);
                passwords.add(alfa[1]);
                scoresO.add(alfa[2]);    
            }
        
        PrintWriter outputStream = null;
  
                try 
                {
                    outputStream =
                            new PrintWriter(new FileOutputStream ("logindetails.txt", false ));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                for (int i =0; i<usernames.size(); i++)
                {
                  if(player.equals(usernames.get(i)))
                   {
                    outputStream.println(usernames.get(i)+","+passwords.get(i)+","+scoresSeparate.get(i));
                   }
                   else
                    outputStream.println(usernames.get(i)+","+passwords.get(i)+","+scoresO.get(i));
                    
                   
            }

                   outputStream.close();

        }
                
        }
