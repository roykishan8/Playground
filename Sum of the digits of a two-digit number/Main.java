import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      String a=scan.nextLine();
      String b[]=a.split("");
      int c=Integer.parseInt(b[0]);
      int d=Integer.parseInt(b[1]);
      System.out.println(c+d);
	}
}