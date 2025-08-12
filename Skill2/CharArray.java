package Skill2;
import java.util.Scanner;
public class CharArray{
    public static void main(String[] args){
        char[] charArray={'H','e','l','l','o'};
        String strObj="Java";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput=sc.nextLine();
        System.out.println("Character Array as String: " + new String(charArray));
        System.out.println("String Object: " + strObj);
        System.out.println("User Entered String: " + userInput);
        String newStrObj = new String(charArray);
        System.out.println("Converted String from char array: " + newStrObj);
        sc.close();
    }
}
