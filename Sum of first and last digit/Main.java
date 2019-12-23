import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int Number, num1, num2, sum;
		Scanner sc = new Scanner(System.in);		
			Number = sc.nextInt();
       num1 = Number;
			while( num1 >=10) 
            {
            num1 = num1/10;
                    }
         num2 = Number % 10;
        sum = num1 + num2;
      System.out.println(sum);
	}
}