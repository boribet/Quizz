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
        
        String user = null;
        String pass = null;
        String score = null;
        //ArrayList<String> scores = new ArrayList<>();
        //String[] scores = new String[3];

       
        
        while(read.hasNextLine()){
            user = read.nextLine();
            //System.out.println(user);
            pass = read.nextLine();
            score = read.nextLine();
            //System.out.println(pass);
            //read.next();
            
            if(user.equals(username.getUsername()) && pass.equals(password.getPassword()))
            {
                System.out.println("Welcome back!");
                
                String[] scorecollect = score.split(",");
                for(int i =0; i<scorecollect.length; i++)
                {
                 System.out.print(scorecollect[i]+", ");   
                }
                
                
                
               /*  for(int i=0; i<score.; i++)
                {
                    read.useDelimiter(",");
                    scores.add(read.next());
                    System.out.println(scores);

                } */
                
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