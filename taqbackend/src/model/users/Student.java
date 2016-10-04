package model.users;
import java.util.Date;
/*
Student.java 

This class creates a student in our system

*/


public class Student{
	
	String name;
	String student_Login;
	String student_Password;
	int total_Times_In_Queue;
	int total_Times_Exiting_Queue;
	Date timeEnteringQueue;
	int num_No_Shows;
	int current_Wait_Time;
	int number_In_Queue;




	public Student(String studentFirstName, String studentLastName, String netID, String studentPassword){
		name = studentFirstName + " " + studentLastName;
		student_Login = netID;
		student_Password = studentPassword;
		total_Times_In_Queue = 0;
		total_Times_Exiting_Queue = 0;
		num_No_Shows = 0;
		current_Wait_Time = 0;
		number_In_Queue = 0;
		timeEnteringQueue = null;
	}
	
	public void setDate(Date d){
		timeEnteringQueue = d;
	}

	public void setCurrentWaitTime(int i){
		current_Wait_Time = i;
	}
	
	public Date getTimeEnteringQueue(){
		return timeEnteringQueue;
	}
	
	public void increment_Times_Exiting_Queue(){
		total_Times_Exiting_Queue = total_Times_Exiting_Queue +1;
	}
	public void increment_Times_In_Queue(){
		total_Times_In_Queue = total_Times_In_Queue + 1;
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

	public int get_Total_Times_In_queue(){
		return total_Times_In_Queue;
	}

	public int get_Total_Times_Exiting_Queue(){
		return total_Times_Exiting_Queue;
	}

	public int get_Num_No_Shows(){
		return num_No_Shows;
	}

	public int get_Current_Wait_Time(){
		return current_Wait_Time;
	}

	public int get_Number_In_Queue(){
		return number_In_Queue;
	}
}