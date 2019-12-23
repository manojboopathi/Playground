import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int i;
      int n = in.nextInt();
      for(i=1; i<=2*n; i++)
      {
        if(i%2 == 1)
        System.out.println(i);
      }
	}
}