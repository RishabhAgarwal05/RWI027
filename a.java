package singleinheritance;
class Parent{
	void bike ()
	{
		System.out.println("Hero");
		
	}
}
class chield extends Parent{
	void cycle () {
		System.out.println("honda");}
}

	public class a {
public static void main(String[]args) { 

chield c=new chield();
c.cycle();
c.bike();
	}
}