import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
      String a=scan.nextLine();
      String b[]=a.split("");
    for(int i=2;i>=0;i--){
      System.out.print(b[i]);
    }
    
  }
}