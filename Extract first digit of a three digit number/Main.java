import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      String a=scan.nextLine();
      String b[]=a.split("");
      System.out.println(b[0]);
	}
}