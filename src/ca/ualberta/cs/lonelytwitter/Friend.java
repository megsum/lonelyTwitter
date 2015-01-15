package ca.ualberta.cs.lonelytwitter;


public class Friend {
	protected static String username;
    protected Boolean closefriend;
    protected Boolean related;
	public String getUsername() {
		return username;
	}

	public static void setUsername(String x) {
		username = x;
	}

	public Friend(String username) {
		super();
		this.username = username;
	}
	
	public void Closefriend(String username, Boolean closefriend ){
		if (closefriend){
			CloseFriend.setUsername(username);
		}
	}
	
	public void Related(String username, Boolean related ){
		if (related){
			Related.setUsername(username);
		}
	}	
	public Friend() {
		super();
		this.username = "anonymous";
	}
}
