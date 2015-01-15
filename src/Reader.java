import ca.ualberta.cs.lonelytwitter.User;


public class Reader extends User {
	@Override 
	public void setUsername(String x) {
		if (x.length() <= 8){
			throw new RuntimeException("Name too short!");
		}
		this.username = x;
	}
}
