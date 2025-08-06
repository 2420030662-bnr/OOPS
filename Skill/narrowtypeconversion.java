package Skill;
import java.util.Scanner;
public class narrowtypeconversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
double b;
b=sc.nextDouble();
int n=(int)b;
System.out.println("double value ="+b);
System.out.println("int value ="+n);
sc.close();
	}

}