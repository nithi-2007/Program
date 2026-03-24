package Patterns;
import java.util.*;
public class stringpattern {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.println("sp.a");
	   for(int i=1;i<=num;i++) {
		  for(char ch='A';ch<'A'+i;ch++) {
		     System.out.print(ch); 
		  }
		   System.out.println();
	   }
	   System.out.println("sp.b");
	   for(int i=num;i>=1;i--) {
		   for(char ch='A';ch<'A'+i;ch++) {
			   System.out.print(ch);
		   }
		   System.out.println();
	   }
	   System.out.println("sp.c");
	   for(int i=1;i<=num;i++) {
		   char ch=(char)('A'+i-1);
		   for(int j=1;j<=i;j++) {
			   System.out.print(ch);
		   }
		   System.out.println();
	   }
	   System.out.println("sp.d");
	   for(int i=1;i<=num;i++) {
		   for(int j=1;j<=num-i;j++) {
			   System.out.print(" ");
		   }
		   char ch='A';
		   int breakpoint=(2*(i-1)+1)/2;
		   for(int k=1;k<=2*(i-1)+1;k++) {
			   System.out.print(ch);
			   if(k<=breakpoint) ch++;
			   else ch--;
		   }
		   for(int j1=1;j1<=num-i;j1++) {
			   System.out.print(" ");
		   }
		   System.out.println();
	   }
	   System.out.println("sp.e");
	   for(int i=1;i<=num+1;i++) {
		   char ch=(char)('E'-(i-1));
		   for(int j=1;j<=i;j++) {
			   System.out.print(ch);
			   ch=(char)(ch+1);
		   }
		   System.out.println();
	   }
	   System.out.println("sp.d");
	   
   }
}
