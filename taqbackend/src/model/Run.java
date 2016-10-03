import java.util.ArrayList;

import users.Student;


public class Run {
    ArrayList<Class> classes;
	
    
    public Run(){
    	classes = new ArrayList<Class>();
    }
    
	public Class checkUser(String netID, String password){
		for(int i=0; i<classes.size(); i++){
			ArrayList<Student> classList = classes.get(i).getClassList();
			for(int j=0; j<classList.size(); j++){
				if(classList.get(j).get_Student_Login().equals(netID) &&
						classList.get(j).get_Student_Password().equals(password)) {
					return classes.get(i); //== or string compare
				}
			}
		}
		System.out.println("Invalid login ID or password.");
		return null;
	}
	
	
	
	
	
	public Student registerUser(Class c, String studentFirstName, String studentLastName, String netID, String studentPassword){
		Student a = new Student(studentFirstName,studentLastName,netID,studentPassword);
		c.addStudent(a);
		return a;
	}
	
	public void addClass(Class c){
		classes.add(c);
	}
	
	
	 public static void main(String[] whatever){
		 Run r = new Run();
		 Class c = new Class( "127A");
		 r.addClass(c);
		 
		 Student a = r.registerUser(c,"jared", "worthington", "jworthington", "password");
		 Student b = r.registerUser(c,"Eric", "Blitzer", "eblitzer", "password");
		 	 
		 c.studentQueue.openQueue();
		 
		 c.studentQueue.addStudent(a);
		 c.studentQueue.addStudent(b);
		 
		 c.studentQueue.deleteStudent(a);
		 c.studentQueue.addStudent(a);
		 System.out.println(c.studentQueue.getLength());
		 
		 for(int i=0; i<c.studentQueue.getLength(); i++){
			 System.out.println(c.studentQueue.getStudent(i).get_Student_Name());
		 }
		 
		 System.out.println( (r.checkUser("jworthington","password").getName()));
		 //System.out.println( (r.checkUser("jworthington","pass").getName()));
		// System.out.println( (r.checkUser("jworthingt","password").getName()));
		 
	 }
}
