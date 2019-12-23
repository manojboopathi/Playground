import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner ( System .in);
      int n = in.nextInt();
      for (int row = 1; row <= n; row++)
      {
        for (int column = 1; column <= n; column++)
        {
          System.out.print(row);
        }
        System.out.print("\n");
      }
    	}
}