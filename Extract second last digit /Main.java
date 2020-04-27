import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      String a=scan.nextLine();
      String b[]=a.split("");
      int c=b.length;
      System.out.println(b[c-2]);
	}
}