
package palindrome;
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int no=s.nextInt();
int temp=no;
int rev=0,rem;
while(temp!=0)
{
	rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
}
if(no==rev)
{

		System.out.println("palindrome number");
}
	else
		System.out.println("not palindrome number");	
	}
	
}
