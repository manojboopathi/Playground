import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
            int a, b,  c, d;
        Scanner in= new Scanner (System.in);
      a = in.nextInt();
      b = a/100;
      c = a%10;
      d = b+c;
      System.out.println(d);      
	}
}