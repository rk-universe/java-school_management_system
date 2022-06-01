package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class func 
{
	Scanner sc = new Scanner(System.in);
	public void AddStudent(int i , ArrayList<students> st)
	{
		int fees=0;
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter the standard in which you want to add the student                                              |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int std=sc.nextInt();
		while(fees==0) {                                             //to get the Fees of the student
		switch(std) {
		case 1:
			{
				fees=600;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("| Fess for 1st std is Rs 600                                                                           |");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 2:
			{
				fees=650;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("| Fess for 2nd  std is Rs 650                                                                          |");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 3:
			{
				fees=700;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("| Fess for  3rd std is Rs 700                                                                          |");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 4:
			{
				fees=750;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for  4th std is Rs 750 																			|");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 5:
			{
				fees=800;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for  5th std is Rs 800 																			|");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 6:
			{
				fees=850;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for  6th std is Rs 850 																			|");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 7:
			{
				fees=900;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for  7th std is Rs 900 																			|");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 8:
			{
				fees=950;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for  8th std is Rs 950																				| ");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 9:
			{
				fees=980;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for 9th std is Rs 980 																			   |");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
		case 10:
			{
				fees=1000;
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("Fess for  10th std is Rs 1000                                  											|");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				break;
			}
			default:
			{
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("| Please enter valind input                                                                             |");
				System.out.println("-------------------------------------------------------------------------------------------------------");
				fees=0;
			}
		}
		}
	
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter student first name                                                 					           |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		String first_name=sc.nextLine();
		sc.nextLine();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter student last name              					                                               |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		String last_name=sc.nextLine();

		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter student age                          				                                           |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		int age=sc.nextInt();
	
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter student gender         				                                                           |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		sc.nextLine();
		String gender=sc.nextLine();
	
		sc.nextLine();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter student contact                                                         				       |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int contact=sc.nextInt();
		
		sc.nextLine();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter student city                                                             				      |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		String city=sc.nextLine();
		
		//set the value entered by user 
		students s =new students();
		st.add(s);
		st.get(i).setStd(std);
		st.get(i).setFirst_name(first_name);
		st.get(i).setLast_name(last_name);
		st.get(i).setStudent_id(i);
		st.get(i).setAge(age);
		st.get(i).setContact(contact);
		st.get(i).setCity(city);
		st.get(i).setTotal_Fee(fees);
		st.get(i).setFee_Balance(fees);
		st.get(i).setFee_status("Not paid");
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| congrates you have successfully added the student            					                        |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		sc.nextLine();
		return;
	}
	
	
	public void DeleteStudent( ArrayList<students> st) {
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter the student id to remove the student                                          				   |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int rm=sc.nextInt(); 
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Are you sure you want to remove the student  |   Press 1 for YES Or 0 for NO       				  |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int c=sc.nextInt();
		if(c==1) {
		st.remove(rm);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| student remove successfuly      					                                                    |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		}
		else
		{
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| ok...you don't want to delete       					                                                |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
		}
		
		return;
	}
	public void display( ArrayList<students> st) {
		int length=st.size();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| press 1 for all student list  |  press 0 for list as per std                					        |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int ch=sc.nextInt();
		
		if(ch==0) {
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter the standard           				               		                                        |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int standard=sc.nextInt();
		
		for(int j=0;j<length;j++) 
		{
			
			int stByList=st.get(j).getStd();
			
			if(standard==stByList) {
				System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| "+j+" Std = "+st.get(j).getStd() + " "+st.get(j).getFirst_name() + " "+st.get(j).getLast_name()+"        |");
	
			}
		
		}
		System.out.println("-------------------------------------------------------------------------------------------------------");
		}
		else
		{
			for(int j=0;j<length;j++) 
			{
				System.out.println("-------------------------------------------------------------------------------------------------------");
				System.out.println("| "+j+" Std = "+st.get(j).getStd() + " "+st.get(j).getFirst_name() + " "+st.get(j).getLast_name()+"    |");
			
			}
			System.out.println("-------------------------------------------------------------------------------------------------------");
		}
		
		sc.nextLine();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("if you want to see a full detail of a student then enter the student id else press -1					|");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int q=sc.nextInt();
		if(q!=-1) {
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Name - "+st.get(q).getFirst_name()+" "+st.get(q).getLast_name()+"                				  |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Age - "+st.get(q).getAge()+"                                              			              |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Std - "+st.get(q).getStd()+"                                         						          |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Gender - "+st.get(q).getGender()+"                                          				          |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Contact - "+st.get(q).getContact()+"                                         				          |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| City - "+st.get(q).getCity()+"                                                    			      |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Total Fees - "+st.get(q).getTotal_Fee()+"                                                    	      |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Fee Status - "+st.get(q).getFee_status()+"                                                      	  |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Balance Fees - "+st.get(q).getFee_Balance()+"                                                       |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		}
		sc.nextLine();
		sc.nextLine();
		return;
		
	}
	public void payFee(ArrayList<students> st)
	{
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("| Enter the student Id                                                                                  |");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		int ids=sc.nextInt();
		int BalanceFee=st.get(ids).getFee_Balance();

	
		if(!(BalanceFee == 0)) {
			int TotalFees=st.get(ids).getTotal_Fee();
		int balance;
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| Name - " +st.get(ids).getFirst_name()+" "+st.get(ids).getLast_name()+"                                |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| Std - "+st.get(ids).getStd()+"                                         						          |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| Total fee of the student is"+TotalFees+"																|");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| Balance fees of the student is "+BalanceFee+"                                                          |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("| How much you want to pay                                                                              |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			int amount=sc.nextInt();
			
			
			
				balance=BalanceFee-amount;
			
			st.get(ids).setFee_Balance(balance);
			if(balance==0 )
			{
				
				st.get(ids).setFee_status("Fully paid");
			}
			else {
				st.get(ids).setFee_status("partially paid");
			}
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("congrates fees is paid                                                                                  |");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			return;
			
	}
	else{
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("Fees is fully paid																						");
			System.out.println("-------------------------------------------------------------------------------------------------------");
		}
	}
	
		
	}







