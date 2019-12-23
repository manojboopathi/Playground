import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int input = num;
	    int sum = 0;
	    while(num > 0){
	        int rem = num % 10;
	        int fact = 1;
            for(int i = 1; i <= rem; i++)
	        {
	            fact = fact * i;
	        }
	        sum = sum + fact;
	        num = num / 10;
	    }
	    if(input == sum)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}