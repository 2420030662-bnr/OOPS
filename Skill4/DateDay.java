package Skill4;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;
public class DateDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = sc.nextLine();
        LocalDate date=LocalDate.parse(dateInput);
        DayOfWeek day=date.getDayOfWeek();
        System.out.println("That date falls on: " + day);
        sc.close();
    }
}
