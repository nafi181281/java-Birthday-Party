import java.util.Scanner;

public class BirthdayPartyMissCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter friend's year of birth: ");
        int birthYear = sc.nextInt();

        
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter how often Asha misses (e.g., 2 means every 2nd party): ");
        int missFrequency = sc.nextInt();

        int totalParties = currentYear - birthYear + 1;

        
        int missedParties = totalParties / missFrequency;

        
        System.out.println("Total parties invited: " + totalParties);
        System.out.println("Parties missed: " + missedParties);
        System.out.println("Parties attended: " + (totalParties - missedParties));

        sc.close();
    }
}

