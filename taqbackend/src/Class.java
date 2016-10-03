import java.util.*;
import users.*;

public class Class {

	String name;
	ArrayList <Student> classList;
	ArrayList <SectionLeader> slList;
	Queue studentQueue;
	//Notes
	
	
 public static void main(String[] whatever){
	 
	 Student a = new Student ("jared", "worthington", "jworthington", "password");
	 Student b = new Student ("Eric", "Blitzer", "eblitzer", "password");
	 
	 Class c = new Class( "127A");
	 
	 c.addStudent(a);
	 c.addStudent(b);
	 
	 c.studentQueue.openQueue();
	 
	 c.studentQueue.addStudent(a);
	 c.studentQueue.addStudent(b);
	 
	 c.studentQueue.deleteStudent(a);
	 c.studentQueue.addStudent(a);
	 System.out.println(c.studentQueue.getLength());
	 
	 for(int i=0; i<c.studentQueue.getLength(); i++){
		 System.out.println(c.studentQueue.getStudent(i).get_Student_Name());
	 }
	 
	 
 }
 
 
 
 public Class(String className){
	 name = className;
	 classList= new ArrayList <Student>();
	 studentQueue = new Queue();
 }
 
 
 public void openQueue(){
	 studentQueue.openQueue();
 }
 
 public void addStudent(Student s){
	 classList.add(s);
 }
 
 

 //Getters & Setters
 
 public String getName(){
	 return name;
 }
 
 public ArrayList<Student> getClassList(){
	 return classList;
 }
 
 public Queue getStudentQueue(){
	 return studentQueue; 
 }
}
