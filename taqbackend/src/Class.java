import java.util.*;
import users.*;

public class Class {

	String name;
	ArrayList <Student> classList;
	Queue studentQueue;
	//Notes
	
	
 public static void main(String[] whatever){
	 
	 
	
	 
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
