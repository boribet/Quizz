/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zceibet
 */
public class LoginStart {
    
    public LoginStart () throws IOException{  
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Press R to register and L to log in: ");
            String action1 = scan.nextLine();
            
            switch(action1)
            {
                case("R"):
                    Register newuser = new Register();
                    break;
                    
                case("L"):
                    LoginFileCheck login = new LoginFileCheck();
                    break;
                
                default:
                    LoginStart startlog = new LoginStart();
                    break;
                    
            }
        //LoginFileCheck login = new LoginFileCheck();
    }
            
    
}
