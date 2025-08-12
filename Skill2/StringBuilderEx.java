package Skill2;
import java.util.Scanner;
public class StringBuilderEx{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        StringBuilder sb1=new StringBuilder(sc.nextLine());
        System.out.print("Enter second string: ");
        StringBuilder sb2=new StringBuilder(sc.nextLine());
        System.out.println("First StringBuilder: " + sb1);
        System.out.println("Second StringBuilder: " + sb2);
        sb2.append(sb1);
        System.out.println("After joining first to second:");
        System.out.println("First StringBuilder: " + sb1);
        System.out.println("Second StringBuilder: " + sb2);
        sc.close();
    }
}
