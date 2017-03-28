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
        
        String user = null;
        String pass = null;
        //ArrayList<Integer> scores = new ArrayList<Integer>();
        String score = null;
        
       
        while(read.hasNextLine())
        {
            user = read.nextLine();
            pass = read.nextLine();
            score = read.nextLine();
            
           
            //read.next();
            
            if(user.equals(username))
            {
                System.out.println("That username is already taken! \n");
                Register register = new Register();

            }
        
        }    
            
                System.out.println("Enter a password: ");
                password = scan.nextLine();

                PrintWriter outputStream = null;


                   outputStream.println(username);
                   outputStream.println(password);
                   outputStream.println("0");

                   outputStream.close();
                try {
                    outputStream =
                            new PrintWriter(new FileOutputStream ("logindetails.txt", true ));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }

                   outputStream.println(username);
                   outputStream.println(password);
                   outputStream.println("0");

                   outputStream.close();


                System.out.println("Now log in. ");
                LoginFileCheck login1 = new LoginFileCheck();
            

        
    }
}