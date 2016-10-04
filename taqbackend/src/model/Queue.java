package model;

import java.util.*;
import model.users.*;


public class Queue{
	
	ArrayList<Student> queue;
	int avgTimeWithStudents;
	boolean open;
	ArrayList<Student> lastFive;
	ArrayList<Integer> timesWithStudents;
	
	public Queue(){
		queue = new ArrayList<Student>();
		avgTimeWithStudents=0;
		open=false;
		lastFive = new ArrayList<Student>();
	}
	
	public void updateQueueTimes(){
		for(int i=0; i<queue.size(); i++){
			Student s = queue.get(i);
			s.setCurrentWaitTime((i+1)*avgTimeWithStudents);
		}
	}
	
	public int getLength(){
		return queue.size();
	}
	
	public ArrayList<Student> getQueue(){
		return queue;
	}
	
	public int getAvgTime(){
		return avgTimeWithStudents;
	}
	
	public boolean isOpen(){
		return open;
	}
	
	public void openQueue(){
		if(open==false) open=true;
		else System.out.println("Queue is already open!");
	}
	
	public void closeQueue(){
		if(open==true) {
			queue = new ArrayList<Student>();
			open=false;
		}
		else System.out.println("Queue is already closed!");
	}
	
	public Student getStudent(int i){
		return queue.get(i);
	}
	
	public void addStudent(Student student){
		if(queue.contains(student) == false){
			queue.add(student);
			student.increment_Times_In_Queue();
			student.setDate(new Date());
		}
	}
	
	public void updateAvgTimeWithStudents(){
		int t=0;
		for(int i=0; i<timesWithStudents.size(); i++){
			t=t+timesWithStudents.get(i);
		}
		avgTimeWithStudents = (int) (t / (timesWithStudents.size())); //time in seconds
	}
	
	public void deleteStudent(Student student){
		if(queue.contains(student)){
			queue.remove(student);
			if(queue.indexOf(student)==0){
				student.increment_Times_Exiting_Queue();
				Date exitDate = new Date();
				int seconds = (int) (exitDate.getTime()- student.getTimeEnteringQueue().getTime())/1000;
				
				if(timesWithStudents.size()<25){
					timesWithStudents.add(seconds);
				}
				else{
					timesWithStudents.remove(0);
					timesWithStudents.add(seconds);
				}
				
				updateAvgTimeWithStudents();
				
				if(lastFive.size()<5) lastFive.add(student);
				else{
					lastFive.remove(0);
					lastFive.add(student);
				}
			}
		}
		
	}
	
}