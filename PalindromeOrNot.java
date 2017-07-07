package guvi;
import java.util.Scanner;
import java.io.*;
public class PalindromeOrNot {
	public static void main(String args[]){
		int n;
		int m;
		int a=0;
		int x;
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		m=n;
		while(n!=0){
			x=n%10;
			a=a*10+x;
			n/=10;
			}
		if(m==a){
			System.out.println("it is a palindrome"+m);
		}
		else{
			System.out.println("it is not a palindrome");
		}
	}

}
