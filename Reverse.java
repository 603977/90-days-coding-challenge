class Main {
public static void main(String[] args) {
int num = 1234, reverse = 0;
System.out.println("Original Number: " + num);
while(num != 0) {
int digit = num % 10;
reverse = reverse * 10 + digit;
num = num/10;
  }
  System.out.println("Reversed Number: " + reversed);
  }
}
