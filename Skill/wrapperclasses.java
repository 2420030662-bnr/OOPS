package Skill;
import java.util.Scanner;
public class wrapperclasses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a;
		a=sc.nextInt();
		Integer k=Integer.valueOf(a);
		Integer p=a;
		System.out.println(a+" "+k+" "+p);	
		sc.close();
	}

}