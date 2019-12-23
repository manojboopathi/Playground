import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int a, b, c, d;
        Scanner in= new Scanner (System.in);
      a = in.nextInt();
      b=a%10;
      c=a/10;
      d=c+b;
       System.out.println(d);
	}
}