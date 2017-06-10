package lab11;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
*
* @author Ahmed Khan
*/

public class Main {

   
    public static void main(String[] args) {
       //User inputs
       Scanner obj= new Scanner(System.in);
       Scanner obj2= new Scanner(System.in);
       
       //Object of class User
       User u= new User(); 
       
       //Arraylist for Menu
       ArrayList<String> al1=new ArrayList<>();
       al1.add("** [1] Destination\t\t\t**");
       al1.add("** [2] Passengers\t\t\t**");
       al1.add("** [3] Billing\t\t\t\t**");
       al1.add("** [4] Viewing\t\t\t\t**");
       al1.add("** [5] Exit\t\t\t\t**");
       
       //Arraylist for choice 1
       ArrayList<String> al= new ArrayList();
	   al.add("** 1.)DAVAO CITY   | Php600 |   20   **");
	   al.add("** 2.)BUTUAN CITY  | Php170 |   20   **");
	   al.add("** 3.)CABADBARAN   | Php150 |   20   **");
	   al.add("** 4.)TANDAG       | Php200 |   20   **");
	   al.add("** 5.)CAGAYAN      | Php250 |   20   **");
      
	   //ArrayList for Storing Passengers Info
       ArrayList<PassangerInfo>al2= new ArrayList();

       //Arraylist for choice 2
       ArrayList<String> a3= new ArrayList();
       a3.add("** 1.)Baldia Town    | Rs 600 |   20   **");
	   a3.add("** 2.)Bin Qasim Town | Rs 170 |   20   **");
	   a3.add("** 3.)Gadap Town     | Rs 150 |   20   **");
	   a3.add("** 4.)Gulshan Town   | Rs 200 |   20   **");
	   a3.add("** 5.)Korangi Town   | Rs 250 |   20   **");     

	   //Variable Declaration
       int c1;
       char c2;
       int fp=0;
       int Pno=0,Pdis=0;
       int des=0;
       int total=0;
       int tfp=0;
       int d=0;
       String Pname="\0";

       
       String []arr=new String[6];
       arr[1]="Baldia Town";
       arr[2]="Bin Qasim Town";
       arr[3]="Gadap Town";
       arr[4]="Gulshan Town";
       arr[5]="Korangi Town";
       

       //User Name and Password
       u.showData();

   do{
	   System.out.println(" ");
	   System.out.println("******************************************");
	   System.out.println("** BUS RESERVATION AND TICKETING SYSTEM **");	
	   System.out.println("******************************************");
	   for(String s :al1){
		    System.out.println(s+"\n");
		    }
		    System.out.println("******************************************");
		    System.out.println("******************************************");
	   
       System.out.print("Enter Choice:");
       c1=obj.nextInt();
	   switch(c1){
	   case 1:
		   System.out.println("***************************************");
		   System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
		   System.out.println("***************************************");
		   for(String a:al){
			   System.out.println(a);
		   }
		   System.out.println("***************************************");
		   System.out.println("***************************************");
		   System.out.println("PWD ,STUDENTS & SENIOR CITIZEN WITH 20% DISCOUNT!!!");
		   System.out.println(" ");
		   break;
		   
	   case 2:
		   System.out.println(" ");
		   System.out.println("*****************************************");
		   System.out.println("**    DESTINATION    |  FARE  |  SEAT  **");
		   System.out.println("*****************************************");
		   for(String a:a3){
			   System.out.println(a);
		   }
		   System.out.println("*****************************************");
		   System.out.println("*****************************************");
		   System.out.println("PWD ,STUDENTS & SENIOR CITIZEN WITH 20% DISCOUNT!!!");
		   System.out.println(" ");
		   System.out.print("ENTER PASSANGER'S NAME: ");
		   Pname = obj2.next();
		   
		   System.out.print("ENTER DESTINATION: ");
		   des=obj.nextInt();
		   System.out.print("HOW MANY PASSENGERS ARE YOU: ");
		   Pno=obj.nextInt();
		   System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT: ");
		   Pdis=obj.nextInt();
		   System.out.println(" ");
		   int count=1;
		   if(count==1){
			   if(des==1){
				   fp=600;
		   PassangerInfo p1= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
		   al2.add(p1);
			   }
			   else if(des==2){
				   fp=170;
				   PassangerInfo p1= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p1);
					   }
			   else if(des==3){
				   fp=150;
				   PassangerInfo p1= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p1);
					   }
			   else if(des==4){
				   fp=200;
				   PassangerInfo p1= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p1);
					   }
			   else if(des==5){
				   fp=250;
				   PassangerInfo p1= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p1);
					   }
		   count++;
		   }
		   else if(count==2){
			   if(des==1){
				   fp=600;
		   PassangerInfo p2= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
		   al2.add(p2);
			   }
			   else if(des==2){
				   fp=170;
				   PassangerInfo p2= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p2);
					   }
			   else if(des==3){
				   fp=150;
				   PassangerInfo p2= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p2);
					   }
			   else if(des==4){
				   fp=200;
				   PassangerInfo p2= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p2);
					   }
			   else if(des==5){
				   fp=250;
				   PassangerInfo p2= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p2);
					   }
		   count++;
		   }
		   else if(count==3){
			   if(des==1){
				   fp=600;
		   PassangerInfo p3= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
		   al2.add(p3);
			   }
			   else if(des==2){
				   fp=170;
				   PassangerInfo p3= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p3);
					   }
			   else if(des==3){
				   fp=150;
				   PassangerInfo p3= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p3);
					   }
			   else if(des==4){
				   fp=200;
				   PassangerInfo p3= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p3);
					   }
			   else if(des==5){
				   fp=250;
				   PassangerInfo p3= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p3);
					   }
		   count++;
			   }
		   else if(count==4){
			   if(des==1){
				   fp=600;
		   PassangerInfo p4= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
		   al2.add(p4);
			   }
			   else if(des==2){
				   fp=170;
				   PassangerInfo p4= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p4);
					   }
			   else if(des==3){
				   fp=150;
				   PassangerInfo p4= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p4);
					   }
			   else if(des==4){
				   fp=200;
				   PassangerInfo p4= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p4);
					   }
			   else if(des==5){
				   fp=250;
				   PassangerInfo p4= new PassangerInfo(Pname,arr[des],Pno,Pdis,fp);
				   al2.add(p4);
					   }
		   count++;
			   }
		   System.out.println("***************************************");
		   System.out.println("**\tPASSENGERS DETAIL\t**");
		   System.out.println("***************************************");
		   System.out.println("PASSENGERS NAME: "+Pname);
	       System.out.println("PASSENGERS DESTINATION: "+arr[des]);
           System.out.println("FARE PRICE: "+fp);
		   System.out.println("NO OF PASSENGERS: "+Pno);
		   System.out.println("NO OF PASSENGERS WITH DISCOUNT: "+Pdis);
		   System.out.println("***************************************");
		   System.out.println("***************************************");
		   
		   break;
	   case 3:
		   
		   System.out.println(" ");
			  System.out.print("Enter Passenger's Name:");
			  String a=obj.next();
			  System.out.println(" ");
			  for(int j=0;j<al2.size();j++){
				  if(a.equals(al2.get(j).PassName)){
					  
					  System.out.println("******************************************");
					  System.out.println("******************************************");
					  System.out.println("**\tPASSENGERS DETAIL\t**");
					  System.out.println("PASSENGERS NAME: "+al2.get(j).PassName);
					  System.out.println("PASSENGERS DESTINATION: "+al2.get(j).Des);
					  System.out.println("FARE PRICE: "+al2.get(j).FarePrice);
					  System.out.println("NO OF PASSENGERS: "+al2.get(j).PassNo);
					  System.out.println("NO OF PASSENGERS WITH DISCOUNT: "+al2.get(j).PassDis);
					  System.out.println("******************************************");
					  System.out.println("******************************************");
					  tfp=al2.get(j).FarePrice*al2.get(j).PassNo;
					  d=(al2.get(j).PassDis*al2.get(j).FarePrice);
					  d=((d*20)/100);
					  
					  if(al2.get(j).PassDis==1){
						  tfp=tfp-d;
					  }
					  else if(al2.get(j).PassDis==2){
						  tfp=tfp-d;
					  }
					  else if(al2.get(j).PassDis==3){
						  tfp=tfp-d;
					  }
					  else if(al2.get(j).PassDis==4){
						  tfp=tfp-d;
					  }
					  else if(al2.get(j).PassDis==5){
						  tfp=tfp-d;
					  }
					  
					  System.out.println("Total Fare Price: "+tfp);
					  
					  break;
				  }
				  else{
					  continue;

				  }
				  
			  }
			

		   break;
	   case 4: 
			  for(int k=0;k<al2.size();k++){
				   System.out.println(" ");
				   System.out.println("******************************************");
				   System.out.println("******************************************");
				   System.out.println("**\tPASSENGERS DETAIL\t**");
				   System.out.println("PASSENGERS NAME: "+al2.get(k).PassName);
				   System.out.println("PASSENGERS DESTINATION: "+al2.get(k).Des);
				   System.out.println("FARE PRICE: "+al2.get(k).FarePrice);
				   System.out.println("NO OF PASSENGERS: "+al2.get(k).PassNo);
				   System.out.println("NO OF PASSENGERS WITH DISCOUNT: "+al2.get(k).PassDis);
				   System.out.println("******************************************");
				   System.out.println("******************************************");
					  tfp=al2.get(k).FarePrice*al2.get(k).PassNo;
					  if(al2.get(k).PassDis==1){
						  tfp=tfp-34;
					  }
					  else if(al2.get(k).PassDis==2){
						  tfp=tfp-68;
					  }
					  else if(al2.get(k).PassDis==3){
						  tfp=tfp-102;
					  }
					  else if(al2.get(k).PassDis==4){
						  tfp=tfp-136;
					  }
					  else if(al2.get(k).PassDis==5){
						  tfp=tfp-170;
					  }
					  System.out.println("Total Fare Price: "+tfp);
					  
				   }

			  
		   break;
	   case 5:
		   continue;
		   
	  default:
		  System.out.println("Wrong selection!please select one of the option from Menu!");
		  System.out.println();
	       break;
	   }
	   System.out.print("Do you want another Transition?[Y/N]:");
	   c2=obj.next().charAt(0);
	   if(c2=='n'||c2=='N'){
		   break;
	   }
	   
   }while(c1!=5);
   System.out.println("Thank you");

    }
    
    
}
