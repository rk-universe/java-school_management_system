package StudentManagementSystem;

import java.util.*;


public class Student_management_system {

	
	public static void main(String[] args) {
	//int k=0;
	
		ArrayList<students> st = new ArrayList();
		ArrayList<Integer> in =new ArrayList(); boolean logedin=false;
	 System.out.println("-------------------------------------------------------------------------------------------------------");
	System.out.println("|------------------------------Welcome to the student management App-----------------------------------|");
	System.out.println("-------------------------------------------------------------------------------------------------------");
	System.out.println("|                                    please enter you username                                         |");
	System.out.println("-------------------------------------------------------------------------------------------------------");
	
	Scanner sc = new Scanner(System.in);
	String username=sc.nextLine();


	if(username.equals("Rahul") || username.equals("rahul")) 
	{
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("|Enter your password                                                                                   |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		String password=sc.nextLine();
		
		if(password.equals("Rahul") || password.equals("rahul"))
		{
			logedin=true;
		}
		else 
		{
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| password is wrong                                                                                    |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
		}
	}
	else
	{
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| username not exist                                                                                  |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
	}
	
	AddedStudent ads=new AddedStudent();
	ads.AddedStudent(st);
	

	
	int i=3;
	while(true) {                  //while loop to display the menu again and again
		if(logedin==true) {         //only shown when the user is loged in
	
		
		int choice;
	System.out.println("-------------------------------------------------------------------------------------------------------");
	System.out.println("| choose the action you want to perform                                                                |");
	System.out.println("-------------------------------------------------------------------------------------------------------");
	System.out.println("| 1 Add a Student | 2  Delete a Student | 3 Display the list of student | 4 Pay the fees | 5 Quit      |");
	System.out.println("-------------------------------------------------------------------------------------------------------");
	
	choice=sc.nextInt();
	
	func f=new func();
	
	switch(choice) {
	case 1:
		{
			
			f.AddStudent(i,st);
			break;
		}
	case 2:
		{
			f.DeleteStudent(st);
			break;
		}
	case 3:
		{
			f.display(st);
			
			break;
		}
	case 4:
		{
		
			f.payFee(st);
		 
		   break;
		   
		}
	case 5:
	{
	   logedin=false;     
	   System.out.println("-------------------------------------------------------------------------------------------------------");
	   System.out.println("| Thankyou"+"                                                                                            |");
	   System.out.println("-------------------------------------------------------------------------------------------------------");
	   break;
	   
	}
	}
	
	i++;
	}
	

	
	
	}
	
		
	
}
}
