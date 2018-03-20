package hotel;

public class Review {
	private String name;
	private String email;
	private String comment;
	
	public Review(String name, String email, String comment) {
		this.name=name;
		this.email=email;
		this.comment=comment;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
