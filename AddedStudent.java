package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddedStudent {
	
	
		public void AddedStudent( ArrayList<students> st) {
			
			students s1 =new students();
			students s2 =new students();
			students s3 =new students();
			st.add(s1);
			st.get(0).setStd(6);
			st.get(0).setFirst_name("Rahul");
			st.get(0).setLast_name("Kumawat");
			st.get(0).setStudent_id(0);
			st.get(0).setAge(12);
			st.get(0).setGender("Male");
			st.get(0).setContact(1234567890);
			st.get(0).setCity("koperkhairne");
			st.get(0).setTotal_Fee(850);
			st.get(0).setFee_Balance(850);
			st.get(0).setFee_status("Not paid");
			
			st.add(s2);
			st.get(1).setStd(9);
			st.get(1).setFirst_name("Neha");
			st.get(1).setLast_name("Kumari");
			st.get(1).setStudent_id(1);
			st.get(1).setAge(12);
			st.get(1).setGender("Female");
			st.get(1).setContact(1234567765);
			st.get(1).setCity("Vashi");
			st.get(1).setTotal_Fee(980);
			st.get(1).setFee_Balance(980);
			st.get(1).setFee_status("Not paid");
			
			st.add(s3);
			st.get(2).setStd(10);
			st.get(2).setFirst_name("Manish");
			st.get(2).setLast_name("Gupta");
			st.get(2).setStudent_id(2);
			st.get(2).setAge(12);
			st.get(2).setGender("Male");
			st.get(2).setContact(1234567887);
			st.get(2).setCity("Ghansoli");
			st.get(2).setTotal_Fee(1000);
			st.get(2).setFee_Balance(1000);
			st.get(2).setFee_status("Not paid");
			
		}
	
}
