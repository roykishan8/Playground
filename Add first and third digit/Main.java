import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      String a=scan.nextLine();
      String b[]=a.split("");
      int c=Integer.parseInt(b[0]);
      int d=Integer.parseInt(b[2]);
      System.out.println(c+d);
      
	}
}