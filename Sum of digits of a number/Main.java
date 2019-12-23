import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       int Number, Reminder, Sum = 0;
		Scanner sc = new Scanner(System.in);		
			Number = sc.nextInt();
			while(Number > 0) 
            {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		    }
		System.out.println(Sum);
	}
}