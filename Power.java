import java.util.Scanner;
public class Power {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter no to get the power ");
int n1 = sc.nextInt();
System.out.println("Enter power for that no");
int n2 = sc.nextInt();
int power = 1;
if (n2 >= 1) {
for (int i = 1; i <= n2; i++) {
power = power * n1;
}
System.out.println("Required no is: " +power);
}
}
}
