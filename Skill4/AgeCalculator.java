package Skill4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthdateInput = sc.nextLine();
        LocalDate birthDate=LocalDate.parse(birthdateInput);
        LocalDate t=LocalDate.now();
        Period age = Period.between(birthDate,t);
        System.out.println("You are " + age.getYears() + " years, " +
                           age.getMonths() + " months, and " +
                           age.getDays() + " days old.");
        sc.close();
    }
}
