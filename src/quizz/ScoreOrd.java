/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author home
 */
public class ScoreOrd 
{
    
    public ScoreOrd(ArrayList<String> scores)
    {
         String[] temp = new String[scores.size()];
            temp = scores.toArray(temp);
         String[] sortedscores = sort(temp);
         System.out.println(Arrays.toString(sortedscores));

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
