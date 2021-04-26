import java.util.Scanner;

public class operation {
	private static final String String = null;
	private String firstname;
	private String lastname;
	private int dept;
	private	String emailid;
	private String depart;
	private String company = "company.com";
	private String passchar;
	private String pass;
	private String password;
	private int MailboxCapacity;
	private String alternatemail;
	private int capacity = 500;
	
	
	
	public operation(String firstname,String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
//		System.out.println("Your name: " + firstname + " "+ lastname);
		depart = department();
		;
//		System.out.println("Department: " + depart);
		generateEmail();
//		System.out.println(emailid);
		pass = randomPassword(10);
//		System.out.println("Your password:" + pass);
		setMailboxCapacity(capacity);
	}
	
	public String department() {
		System.out.println("select \n1 for Sales \n2 for Development \n3 for Accounting \n4 for None \nEnter the number: ");

		Scanner inp = new Scanner(System.in);
		dept = inp.nextInt();
		inp.close();
		
		if(dept==1) { return "Sales";}
		if(dept==2) { return "Development";}
		if(dept==3) { return "Accounting";}
		else {return "";	}
	}
	
	public String randomPassword(int passLength) {
		passchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!#";
		char[] passArray = new char[passLength];
		
		
		for(int i =0;i<passLength;i++) {
			int rando = (int)(Math.random()*passchar.length());
			passArray[i] = passchar.charAt(rando);
		}
		return new String(passArray);
	}
	public void generateEmail() {
		//firstname.lastname@department.company.com
		emailid = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + depart.toLowerCase() + "." + company;
	}
	public void setMailboxCapacity(int capacity) {
		MailboxCapacity = capacity;
	}
	public void setAlternateEmail(String email) {
		alternatemail = email;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public int mailboxcapa() { return MailboxCapacity; }
	public String getaltmail() { return alternatemail; }
	public String getpassword() { return password; }
	
	public String showInfo() {
		return "\nNAME: "+ firstname + " "+ lastname +"\nPASSWORD: " +pass+ "\nMAILID: "+emailid+ "\nMAILBOXCAPACITY: "+ MailboxCapacity+"mb";
	}
}
