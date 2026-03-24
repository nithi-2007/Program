package Patterns;
import java.util.*;
public class pattern3 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  System.out.println("3.A");
	  for(int i=num;i>=1;i--) {
		  for(int j=i;j>=1;j--) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  System.out.println("3.B");
	  for(int i=num;i>=1;i--) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j);
		  }
		  System.out.println();
	  }
  }
}
