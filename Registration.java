package login;

public class Registration implements RegistrationService{
	String firstName;
	String lastName;
	String mailId;
	String password;
    public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	String confirmPassword;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isMatching(String pass, String confirmPass)
	{
		if(pass.equals(confirmPass))				
			return true;
		else
			return false;

	}
	
	public void registrationUpdateInfo() {
	
	}
	

}
