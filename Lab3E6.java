import java.util.Scanner;
public class Lab3E6 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter an integer : ");
		   int num=in.nextInt();
		   if(num>0)
		     System.out.println("The absolute value is"+num);
		     else if(num<0)
		       System.out.println("The absolute value is"+num*-1);
		       else
		       System.out.println("The number is zero");
		       
	}
}