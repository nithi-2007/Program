package Patterns;
import java.util.*;
public class pattern4 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 System.out.println("4.A");
	 for (int i=1;i<=num;i++) {
		 for(int j=1;j<=num-i;j++) {
			 System.out.print(" ");
		 }
			 for(int k=1;k<=(2*(i-1))+1;k++) {
				 System.out.print("*");
			 }
			 for(int j1=1;j1<=num-i;j1++) {
				 System.out.print(" ");
			 }
			 System.out.println();
	 }
	 System.out.println("4.B");
	 for(int i=num;i>=1;i--) {
		 for(int j=num-i;j>=1;j--) {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=2*(i-1)+1;k++) {
			 System.out.print("*");
		 }
		 for(int j1=num-i;j1>=1;j1--) {
			 System.out.print(" ");
		 }
		 System.out.println();
	 }
	 System.out.println("4.C");
	 for(int i=1;i<=num;i++) {
		 for(int j=1;j<=num-i;j++) {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=(2*(i-1)+1);k++) {
			 System.out.print("*");
		 }
		 for(int j1=1;j1<=num-i;j1++) {
			 System.out.print(" ");
		 }
		 System.out.println();
	 }
	 for(int i=num-1;i>=1;i--) {
		 for(int j=num-i;j>=1;j--) {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=2*(i-1)+1;k++) {
			 System.out.print("*");
		 }
		 for(int j1=num-i;j1>=1;j1--) {
			 System.out.print(" ");
		 }
		 System.out.println();
	 }
	 
 }
}
