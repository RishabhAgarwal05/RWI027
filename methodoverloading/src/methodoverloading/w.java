package methodoverloading;

public class w {


	void f1()
	{
		int a=7,b=4,c;
		c=(a+b);
		{
			System.out.println("Addition performed= " +c);			
			
		}
	}
	void one(int a,int b)
	{
		int c;
		c=(a+b);
		{
			System.out.println("Addition performed= " +c);			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		w m=new w();
		m.one(50, 0);
		m.one(24,6);
	
	}

}
