import java.util.Date;

public class UserInformation
{
	String firstName;
	String lastName;
	String email;
	String phoneNo;
	String ID;
	String address;
	String occupation;
	String sex;
	
	Date birthdate;

	public UserInformation(String firstName, String lastName, String email, String phoneNo, String NID, String address,
			String occupation, String sex, Date birthdate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.ID = ID;
		this.address = address;
		this.occupation = occupation;
		this.sex = sex;
		this.birthdate = birthdate;
	}

	public String toString()
	{
		return  firstName + "\n" + lastName + "\n" + email + "\n"
				+ phoneNo + "\n" + ID + "\n" + address + "\n" + occupation + "\n" + sex
				+ "\n" + birthdate;
	}
	
	
	
}
