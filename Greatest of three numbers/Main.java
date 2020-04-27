import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      int num1=scan.nextInt();
      int num2=scan.nextInt();
      int num3=scan.nextInt();
      int sum=num1;
      if(num2>sum){
        sum=num2;
      }
      if(num3>sum){
        sum=num3;
      }
      System.out.println(sum);
    }
}