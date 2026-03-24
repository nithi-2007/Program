import java.util.*;
public class product{
	public static void main(String[] args) {
	nest p1=new nest(01,"Laptop",1500,1);
	p1.getTotalPrice();
	p1.display();
	}
}
 class nest{
  int id;
  String name;
  double price;
  int quantity;
  nest(int id,String name,double price,int quantity){
	  this.id=id;
	  this.name=name;
	  this.price=price;
	  this.quantity=quantity;
  }
  void getTotalPrice() {
	  System.out.println(price*quantity);
  }
  void display(){
	  System.out.println("Product:"+name);
  }
}

