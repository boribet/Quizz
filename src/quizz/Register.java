/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author zceibet
 */
public class Register {

    Scanner scan = new Scanner(System.in);
   
    private String username;   // "red" or "green"
    private String password;      // between 1 and 10
    private String name;
    private String pass;
    private String scorelist;

    public Register()
            
    {
        Scanner read = null;
        try{
            read = new Scanner (new FileInputStream("logindetails.txt"));

        }

        catch (FileNotFoundException ex){
            Logger.getLogger(LoginFileCheck.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        System.out.println("Enter a new username: ");
        username = scan.nextLine();
        
        ArrayList<String> scores = new ArrayList<String>();
        ArrayList<String> usernames = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        ArrayList<String> allusers = new ArrayList<String>();
        
       
            for(int i = 0; read.hasNextLine();i++)
            {
                allusers.add(read.nextLine());
                System.out.println("mindenki: "+allusers);
               
                
            }
            
            for(int j = 0; j<allusers.size() ; j++)
           {
                String [] alfa = allusers.get(j).split(";");
                usernames.add(alfa[0]);
                passwords.add(alfa[1]);
                scores.add(alfa[2]);              
            }


            for(int i = 0; i<usernames.size();i++)
            {
                if(usernames.get(i).equals(username))
                {
                    System.out.println("That username is already taken! \n");
                    Register register = new Register();

                }
            }
           
            
                System.out.println("Enter a password: ");
                password = scan.nextLine();
                
                usernames.add(username);
                passwords.add(password);

                PrintWriter outputStream = null;


               //    outputStream.println(usernames);
                //   outputStream.println(passwords);
                //   outputStream.println(scores);

               //    outputStream.close();
                   
                try 
                {
                    outputStream =
                            new PrintWriter(new FileOutputStream ("logindetails.txt", true ));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }

                   outputStream.println(usernames);
                   outputStream.println(passwords);
                   outputStream.println(scores);

                   outputStream.close();


                System.out.println("Now log in. ");
                LoginFileCheck login1 = new LoginFileCheck();
            

        
    }
}
