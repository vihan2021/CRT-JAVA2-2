import java.util.*;
class Div

{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter two nos");
		Double a,b,r;
		a= s.nextDouble();
		b= s.nextDouble();
		if(b==0)
		{
			System.out.println("second no cannot be zero");
			b=1.0;
		}
		r=a/b;
		System.out.println("division="+r);
	}
}
