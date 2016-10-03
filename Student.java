/*
Student.java 

This class creates a student in our system

*/


class Student{
	
	String name;
	String student_Login;
	String student_Password;
	Int total_times_in_queue;
	Int total_times_exiting_queue;
	Int num_No_Shows;
	Int current_Wait_Time;
	Int number_In_Queue;




	Student(String studentFirstName, String studentLastName, String netID, String studentLogin, String studentPassword){
		name = studentFirstName + " " + studentLastName;
		student_Login = netID;
		student_Password = studentPassword;
		total_times_in_queue = 0;
		get_Total_Times_Exiting_Queue = 0;
		num_No_Shows = 0;
		current_Wait_Time = null;
		number_In_Queue = null;
	}



	public String get_Student_Name(){
		return name;
	}

	public String get_Student_Login(){
		return student_Login;
	}

	public String get_Student_Password(){
		return student_Password;
	}

	public Int get_Total_Times_In_queue(){
		return total_times_in_queue;
	}

	public Int get_Total_Times_Exiting_Queue(){
		return total_times_exiting_queue;
	}

	public Int get_Num_No_Shows(){
		return num_No_Shows;
	}

	public Int get_Current_Wait_Time(){
		return current_Wait_Time;
	}

	public Int get_Number_In_Queue(){
		return number_In_Queue
	}
}