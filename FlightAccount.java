//Tangy F
package flighpak;
import java.util.Scanner;

public class FlightAccount {

	public static void main(String[] args) {
		// add objects to call methods
		FlightAccount obj=new FlightAccount();
		obj.useraccountScreen();
		obj.booktixScreen();
		//obj.available();	
		//obj.returning();
	}
	static Scanner keyboard= new Scanner(System.in);
		// #1 Create User Screen METHOD
		public void useraccountScreen(){
			Scanner keyboard=new Scanner(System.in);
			
			//add inputs with Scanners
			System.out.println("Enter your First Name");
			String fname=keyboard.next();
			System.out.println(fname);
			
			System.out.println("Enter Last Name");
			String lname=keyboard.next();
			System.out.println(lname);
			
			System.out.println("Enter email address");
			String eName=keyboard.next();
			System.out.println(eName);
			
			if(eName.contains("@")){
				
				System.out.println(eName);
			}
			else{
				System.out.println("You need an @ symbol in your email address");
			}
			System.out.println("Enter your Date of birth");
			String dob=keyboard.next();
			System.out.println(dob);
			
			System.out.println("Enter your age");
			String age=keyboard.next();
			System.out.println(age);
			
			System.out.println("Enter your Username");
			String un=keyboard.next();
			System.out.println(un);
			
			if(un.length()< 10){
				 System.out.println(un.startsWith(un));
			}else {
				
				System.out.println("Please re-enter. You can only use 10 characters");
			}					
		if(un.startsWith("U")){
				System.out.println(un);
		}
		else{
				System.out.println("Your Username has to start with U"  );
		}
			System.out.println("Enter your Password");
			String pw=keyboard.next();
			System.out.println(pw);
			
			if(pw.length()<10){
				System.out.println(pw.length());
			}
				System.out.println("Please re-enter. Your password.");
			}	
		//#2 booking tickets METHOD
		public void booktixScreen(){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a desination");
			
		String[] fromDestination = { "ftl", "Seattle", "SanFran"};
		String destination1 = keyboard.next();
		int count = 0;
		for(int x=0; x <fromDestination.length; x++){
			if (destination1.equals(fromDestination[x])){
				System.out.println("Vaild destination");
				break;
			}
			count++;
			}
					if(count == 3){
						System.out.println(" invalid destination");
			}  
		//ask user final destination
		System.out.println("What is your final desination?");

		int count1=0;
		//get users input
		String destin=keyboard.nextLine();
		
		//Create a array using strings 
		String[] toDestination = {"Spain","Ireland", "Here"};
		
		//create a for loop RIGHT after User input for the Array
		for (int x=0; x <toDestination.length; x++ ){
			if(destin.equals(toDestination [x])){
				System.out.println("Valid Destination");
				break;
				}
			count1++;	
		}
				if (count1 == 3){
					System.out.println("Invalid ");
		}
		int[] pass= new int [6];
		System.out.println("please enter passengers");
		int passenger=keyboard.nextInt();
	
		try {
			System.out.println(pass[passenger]);	
	}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Please choose a number between 1-5");
	}		
		System.out.println("Enter One way or Round-trip");
		String triptype=keyboard.next();
		System.out.println(triptype);
		}
		//#3 Flight Available METHOD
		public void available(){
			//flight name
			System.out.println("What AIRLINE would you like to travel on going TO your destination? ");
			String [] flightname = {"Jetblue", "Southwest", "Virgin"};
			for(int x = 0; x < flightname.length; x++){
				System.out.println(flightname [x]);	
			}
			//flightnumber
				int [] flightNumber= {101,102,103};
				String flight=keyboard.next();
				for(int y = 0; y < flightNumber.length; y++){
					System.out.println(flightNumber[y]);
				}
					System.out.println("Choose a flight number from above");
					int inputflight=keyboard.nextInt();
					System.out.println(" Congrats! You are traveling on Flight number " + inputflight );
				
			//time to leave	
			System.out.println("What time will you like to LEAVE ");
			int [] departime = {2,4,6,8,10};
			for(int x = 0; x < departime.length; x++){
				System.out.println(departime [x] + "pm" );	
			}
			int fromtime=keyboard.nextInt();
			System.out.println("You have chosen " + fromtime +"pm");
			
			//time to arrive		
			System.out.println("What time will you like to ARRIVE ");
			int [] arrive = {4,6,8,10};
			for(int x = 0; x < arrive.length; x++){
				System.out.println(arrive [x] + "pm");
			}
			int arrivetime=keyboard.nextInt();
			System.out.println("You have chosen " + arrivetime + "pm");
			
			//FIX this part DURATION
			System.out.println("Your flight duration is 2 hours");		
			
			//price
			System.out.println("The cost of this flight is $98.00 USD ");
		}
			//#4 Flight RETURN  METHOD
			public void returning(){
				//flight name
				System.out.println("What AIRLINE would you like to travel on going TO your destination? ");
				String [] flightname = {"Jetblue", "Southwest", "Virgin"};
				for(int x = 0; x < flightname.length; x++){
					System.out.println(flightname [x]);	
				}
				//flightnumber
					int [] flightNumber= {104,105,106};
					String flight=keyboard.next();
					for(int y = 0; y < flightNumber.length; y++){
						System.out.println(flightNumber[y]);
					}
						System.out.println("Choose a flight number from above");
						int inputflight=keyboard.nextInt();
						System.out.println(" Congrats! You are RETURNING on Flight number " + inputflight );
					
				//time to leave	
				System.out.println("What time will you like to DEPART? ");
				int [] departime = {2,4,6,8,10};
				for(int x = 0; x < departime.length; x++){
					System.out.println(departime [x] + "pm" );	
				}
				int fromtime=keyboard.nextInt();
				System.out.println("You have chosen " + fromtime +"pm");
				
				//time to arrive		
				System.out.println("What time will you like to ARRIVE? ");
				int [] arrive = {4,6,8,10};
				for(int x = 0; x < arrive.length; x++){
					System.out.println(arrive [x] + "pm");
				}
				int arrivetime=keyboard.nextInt();
				System.out.println("You have chosen " + arrivetime + "pm");
				
				//FIX this part DURATION
				System.out.println("Your flight duration is 3 hours");		
				
				//price
				System.out.println("The cost of this flight is $98.00 USD ");
			}			
}
		
