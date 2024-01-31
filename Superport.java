package portfolio;

import java.util.Scanner;

public class Superport extends Subport {

    public Superport(String Name, int Age, String Address, String SchoolName, String SchoolAddress) {
        super(Name, Age, Address, SchoolName, SchoolAddress);
    }

    public void DisplayMyWorks() {
    	System.out.println("MyWorks");
    	
        String websiteUrl = "https://mayores04.github.io/RPGdragongamerepeller/";

        System.out.println("To view my works, please open your web browser and go to:");
        System.out.println(websiteUrl);

        // Optionally, you can prompt the user to press Enter before proceeding
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }
}
