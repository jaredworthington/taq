import java.util.ArrayList;
import users.Student;

public class Queue{
	
	ArrayList<Student> queue;
	int avgTimeWithStudents;
	boolean open;
	ArrayList<Student> lastFive;
	
	public Queue(){
		queue = new ArrayList<Student>();
		avgTimeWithStudents=0;
		open=false;
		lastFive = new ArrayList<Student>();
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
		if(queue.contains(student) == false) queue.add(student);
		
		if(lastFive.size()<5) lastFive.add(student);
		else{
			lastFive.remove(0);
			lastFive.add(student);
		}
	}
	
	public void deleteStudent(Student student){
		if(queue.contains(student)) queue.remove(student);
	}
	
}