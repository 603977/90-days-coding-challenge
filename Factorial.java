import java.util.Scanner;
class Factorial
{
public static void main(String[] args) 
{
int fact=1;
int num;
System.out.print("Enter a number to get the factorial: ");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
//System.out.print("Enter a number to get the factorial: ");
  for (int i=1; i<=num; i++)
  {
     fact = fact*i;
   
  }
  System.out.println("Factorial of" +num+ "is" +fact);

 }
}
