package model;

import java.util.*;
import model.users.*;

public class Class {

	String name;
	ArrayList <Student> classList;
	ArrayList <SectionLeader> slList;
	Queue studentQueue;
	//Notes
	
	

 
 
 
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
