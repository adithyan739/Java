import java.util.Scanner;

public class Palin {
  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=reader.nextInt();
    int rev = 0, rem;
    int temp = num;
    while (num != 0) 
    {
      rem = num % 10;
      rev = rev * 10 + rem;
      num =num/10;
    }
    if (temp == rev) {
      System.out.println(temp + " is Palindrome.");
    }
    else {
      System.out.println(temp + " is not Palindrome.");
    }
  }
}

