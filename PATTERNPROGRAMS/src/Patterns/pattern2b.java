package Patterns;
import java.util.*;
public class pattern2b {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.println("2b.1");
	   for(int i=1;i<=num;i++) {
		   for(int j=i;j>=1;j--) {
			   System.out.print(j%2+" ");
		   }
		   System.out.println();
	   }
	}
}
