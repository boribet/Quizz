/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author home
 */
public class ScoreOrd 
{
    
    public String [] ScoreOrd()
    {
        
        Scanner read = null;
        
        try{
            read = new Scanner (new FileInputStream("logindetails.txt"));
            
        }
        
        catch (FileNotFoundException ex){
            Logger.getLogger(LoginFileCheck.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        String user = null;
        String pass = null;
        String score =null;
    
         while(read.hasNextLine()){
            user = read.nextLine();
            pass = read.nextLine();
            score = read.nextLine();
        }
         
        
         String[] scorecollect = score.split(",");
         String[] scores = sort(scorecollect);
         System.out.println(scores);
         
         return scores;

        }
    
    //just the sort method below
                 
            public static  String[] sort(String[] a)
                {
                    for (int index = 0; index < a.length - 1; index++)
                        swap(index,indexOfSmallestFrom(index, a), a);
                    return a;
                }

            private static int indexOfSmallestFrom(int startIndex, Comparable[] a)
            {
                int indexOfMin = startIndex;
                for (int index = startIndex + 1; index < a.length; index++)
                    if (a[index].compareTo(a[indexOfMin]) < 0)
                        indexOfMin = index;
                return indexOfMin;
            }

            private static void swap(int i, int j, Comparable[] a)
            {
                Comparable temp;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
