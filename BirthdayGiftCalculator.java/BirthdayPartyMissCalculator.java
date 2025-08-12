

import java.util.Scanner;
import java.time.LocalDate;

public class BirthdayChocolate {
    LocalDate dateOfBirth; 
    int currentYear; 
    int missedBirthdays; 
    int chocolates; 
    
    public void takeInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        dateOfBirth = LocalDate.parse(dobInput);
        System.out.print("Enter the current year: ");
        currentYear = scanner.nextInt();
        System.out.print("Enter the number of missed birthdays: ");
        missedBirthdays = scanner.nextInt();
        scanner.close();
    }

    
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    
    public void calculateChocolates() {
       
        if (dateOfBirth.getYear() > currentYear) {
            System.out.println("Invalid date of birth. It cannot be in the future.");
            return;
        }
    
        else if (dateOfBirth.getMonthValue() == 2 && dateOfBirth.getDayOfMonth() == 29 && !isLeapYear(currentYear)) {
            System.out.println("Invalid date of birth. February 29 is not valid in the current year.");
            return;
        }
     
        else if (dateOfBirth.getMonthValue() == 2 && dateOfBirth.getDayOfMonth() == 29 && isLeapYear(currentYear)) {
            chocolates = ((currentYear - dateOfBirth.getYear())/4) - missedBirthdays; 
        }
        else{
            chocolates = (currentYear - dateOfBirth.getYear()) - missedBirthdays; 
        }

    }
   
    public static void main(String[] args) {
        BirthdayChocolate birthdayChocolate = new BirthdayChocolate();
        birthdayChocolate.takeInputs(); // 
        birthdayChocolate.calculateChocolates();
        System.out.println("Number of chocolates to give: " + birthdayChocolate.chocolates); 
    }
}
