package guvi;
import java.util.Scanner;
public class NumberOfDigits {
public static void main(String args[]){
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number to be counted");
	n=s.nextInt();
	int count=0;
     while(n!=0){
	count++;
	n=n/10;
	}
	System.out.println(count);
}
}