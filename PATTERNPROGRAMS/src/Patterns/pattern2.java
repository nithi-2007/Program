package Patterns;
import java.util.*;
public class pattern2 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 System.out.println("2.A");
	 for(int i=1;i<=num;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 System.out.println("2.B");
	 for(int i=1;i<=num;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(j);
		 }
		 System.out.println();
	 }
	 System.out.println("2.C");
	 for(int i=1;i<=num;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(i);
		 }
		 System.out.println();
	 }
	 System.out.println("2.D");
	 for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	 }
	 for(int i=num-1;i>=1;i--) {
		 for(int j=i;j>=1;j--) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
 }
}
