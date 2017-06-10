package lab11;
import java.util.Scanner;

public class User {
    String UserName;
    String password;

   void showData(){
       Scanner obj= new Scanner(System.in);

       String us;
       String ps;
       System.out.print("Enter User Name:");
       UserName=obj.next();
       System.out.print("Enter Password:");
       password=obj.next();
       
       if((UserName.equals("1")) && (password.equals("1"))){
           System.out.println("  ");
       }

       
   }
   
   
}