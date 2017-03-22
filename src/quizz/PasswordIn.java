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
public class PasswordIn {
    Scanner scan = new Scanner(System.in);
    public String password;
    
        public PasswordIn()
        {
      System.out.println("Enter your password: ");
      password = scan.nextLine();  
        }
      
        public String getPassword() {
            return password;
        }
}
            