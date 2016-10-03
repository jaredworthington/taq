package model;


public class OfficeHour {
	private int IDNum;
	private boolean inSession;
	
	public OfficeHour(int ID){
		IDNum = ID;
		inSession = false;
	}
	
	public void startOfficeHour(){
		inSession=true;
	}
	
	public void stopOfficeHour(){
		inSession=false;
	}
	
	public boolean isInSession(){
		if(inSession){
			return true;
		}
		else{
		return false;
		}
	}
	
	public int getIDNum(){
		return IDNum;
	}
}



