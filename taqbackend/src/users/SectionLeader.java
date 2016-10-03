package users;

public class SectionLeader {
	
	private String name;
	private String netID;
	private String password;
	
	public SectionLeader(String name, String netID, String password){
		this.name = name;
		this.netID = netID;
		this.password = password;
	}
	
	public void changePassword(String newPassword){
		password = newPassword;
	}
	
	
}
