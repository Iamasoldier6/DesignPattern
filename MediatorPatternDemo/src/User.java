public class User {
	private String mName;

	public User(String name) {
		this.mName = name;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
