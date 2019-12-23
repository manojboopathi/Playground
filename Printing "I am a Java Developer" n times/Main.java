import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int num;
      int count =1;
      Scanner in = new Scanner(System.in);
	  num = in.nextInt();
        while(count <= num)
        {
            System.out.println("I am a Java Developer");
            count = count + 1;
        }
	}
}