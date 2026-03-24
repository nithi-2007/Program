package Patterns;
import java.util.*;
public class pattern7 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   for(int i=1;i<=num;i++) {
		   for(int j1=num-i+1;j1>=1;j1--) {
			   System.out.print("*");
		   }
		   for(int k=1;k<=2*(i-1);k++) {
			   System.out.print(" ");
		   }
		   for(int j2=num-i+1;j2>=1;j2--) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   for(int i=1;i<=num;i++) {
		   for(int j1=1;j1<=i;j1++) {
			   System.out.print("*");
		   }
		   for(int k=1;k<=2*(num-i);k++) {
			   System.out.print(" ");
		   }
		   for(int j2=i;j2>=1;j2--) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
   }
}
