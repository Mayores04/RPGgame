package portfolio;

import java.util.Scanner;
public class Subport {
	public String Name;
	public int Age;
	public String Address;
	public String SchoolName;
	public String SchoolAddress;
	
	public Subport (String Name, int Age, String Address, String SchoolName, String SchoolAddress) {
		this.Name = Name;
		this.Age = Age;
		this.Address = Address;
		this.SchoolName = SchoolName;
		this.SchoolAddress = SchoolAddress;
	}
	
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setAge (int Age) {
		this.Age = Age;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public static String getEmail () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Email: ");
		String Email = scan.nextLine();
		
		return Email;
	}
	
	public static String getPassword () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Password: ");
		String Password = scan.nextLine();
		
	    return Password;
	}
	
	public void DisplayInfo() {
		System.out.println("Access Acount");
		
		if (getEmail().equals("Jakemayores05@gmail.com")) {
			if (getPassword().equals("J@k3m@y0r3s")) {
				System.out.println();
				System.out.println("Successful Login");
				
				System.out.println("Name: " + Name);
				System.out.println("Age: " + Age);
				System.out.println("School: " + SchoolName);
				System.out.println("Address: " + Address);
				
				Superport myWork = new Superport("Jake J. Mayores" , 18 , "Cainta Rizal" , "System Technology Institute (STI)" , "Ortigas-Cainta");
				
				myWork.DisplayMyWorks();
			} else {
				System.out.println("Wrong!!!");
			}
		}else {
			System.out.println("Wrong!!!");
		}
	}
}
