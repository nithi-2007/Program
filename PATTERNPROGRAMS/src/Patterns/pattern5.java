package Patterns;
import java.util.*;
public class pattern5 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int sum=1;
	   for(int i=1;i<=num;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(sum+" ");
			   sum=sum+1;
		   }
		   System.out.println();
	   }
   }
}
