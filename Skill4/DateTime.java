package Skill4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date-time format (dd/MM/yyyy HH:mm:ss): ");
        String format = sc.nextLine();
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(format);
        String output = now.format(formatter);
        System.out.println("Formatted Date-Time: " + output);
        sc.close();
    }
}
