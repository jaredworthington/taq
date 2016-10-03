package users;

public class Instructor {
	
	private String name;
	private String netID;
	private String password;
	
	public Instructor(String name, String netID, String password){
		this.name = name;
		this.netID = netID;
		this.password = password;
	}
	
	public void changePassword(String newPassword){
		password = newPassword;
	}
	
	
}

