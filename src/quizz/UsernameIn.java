/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;
import java.util.Scanner;
/**
 *
 * @author zceibet
 */

public class UsernameIn {
    
    Scanner scan = new Scanner(System.in);
    public String username;
    
    public UsernameIn()
    {
      System.out.println("Enter your username: ");
      username= scan.nextLine();  
        
    }
    
    public String getUsername() {
            return username;
      }
    
}