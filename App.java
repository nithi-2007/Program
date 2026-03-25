class user{
	String name;
	String phone;
	String location;
	user(String name,String phone,String location){
		this.name=name;
		this.phone=phone;
		this.location=location;
	}
	void displayinfo() {
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phone);
		System.out.println("location:"+location);
	}
}
class Rideuser extends user{
	String vehicletype;
	Rideuser(String name,String phone,String location,String vehicletype){
		super(name,phone,location);
		this.vehicletype=vehicletype;
	}
	void rideuserinfo() {
		displayinfo();
		System.out.println("VehicleType:"+vehicletype);
		System.out.println();
	}
}
class FoodDeliveryuser extends user{
	String favfood;
	FoodDeliveryuser(String name,String phone,String location,String favfood){
		super( name, phone, location);
		this.favfood=favfood;
	}
	void fooddeliveryuserinfo() {
		displayinfo();
		System.out.println("FavFood:"+favfood);
		System.out.println();
	}
}
class parceldelivery extends user{
	int parcelweight;
	parceldelivery(String name,String phone,String location,int parcelweight){
		super( name, phone, location);
		this.parcelweight=parcelweight;
	}
	void parcelinfo() {
		displayinfo();
		System.out.println("Parcel weight:"+parcelweight);
	}
}
public class App{
	public static void main(String[] args) {
		Rideuser r1=new Rideuser("AAA","12345","ZZZ","AUDICAR");
		FoodDeliveryuser f1=new FoodDeliveryuser("BBB","56789","YYY","BRIYANI");
		parceldelivery p1=new parceldelivery("CCC","34567","XXX",12);
		r1.rideuserinfo();
		f1.fooddeliveryuserinfo();
		p1.parcelinfo();
	}
}