/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizz;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginFileCheck {
    Scanner scan = new Scanner(System.in);

        public LoginFileCheck () {

        UsernameIn username = new UsernameIn(); 
        PasswordIn password = new PasswordIn();

        Scanner read = null;
        
        try{
            read = new Scanner (new FileInputStream("logindetails.txt"));
            
        }
        
        catch (FileNotFoundException ex){
            Logger.getLogger(LoginFileCheck.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        ArrayList<String> scores = new ArrayList<String>();
        ArrayList<String> usernames = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        ArrayList<String> allusers = new ArrayList<String>();

       
        
        for(int i =0; read.hasNextLine();i++)
            {
                allusers.add(read.nextLine());
               
                
            }
            
            for(int j = 0; j<allusers.size() ; j++)
           {
                String [] alfa = allusers.get(j).split(",");
                usernames.add(alfa[0]);
                passwords.add(alfa[1]);
                scores.add(alfa[2]); 
                
            if (j==0)
                {
            usernames.get(j).equals(allusers.get(j).replace("[", ""));  //remove the right bracket
            usernames.get(j).equals(allusers.get(j).replace("]", ""));  //remove the left bracket
            usernames.get(j).equals(allusers.get(j).trim());   
                }
            
            }


            for(int i = 0; i<usernames.size();i++)
            {

                if(usernames.get(i).equals(username.getUsername()) && passwords.get(i).equals(password.getPassword()))
                {
                    System.out.println("Welcome back!");
                    System.exit(0);
                    break;
                
                }
            }
               
            

            System.out.println("Username and password don't match Press R to register or B to try again. ");
            String action = scan.nextLine();
            
            switch(action)
            {
                case("R"):
                    Register newuser = new Register();
                    break;
                    
                case("B"):
                    LoginFileCheck login = new LoginFileCheck();
                    break;
                    
            }
            }
        

}
