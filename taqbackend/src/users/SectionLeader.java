package users;

public class SectionLeader {
	
	private String name;
	private String netID;
	private String password;
	private boolean isActive;
	
	public SectionLeader(String name, String netID, String password){
		this.name = name;
		this.netID = netID;
		this.password = password;
		isActive = false;
	}
	
	public void changePassword(String newPassword){
		password = newPassword;
	}
	
	public void setToActive(){
		if(isActive==false) isActive=true;
	}
	
	public void setToInactive(){
		if(isActive==true) isActive=false;
	}
	
	
}
