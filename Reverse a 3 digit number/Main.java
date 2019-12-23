import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int a,b,c,d,e;
    Scanner in = new Scanner(System.in);
     a= in.nextInt();
    b=a%10;
    c=(a%100)/10;
    d=a/100;
    e=(b*100)+(c*10)+d;
    System.out.println(e);
  }
}