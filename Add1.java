import java.util.Scanner;
import vamsi.Arth;
class Add1

{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter two nos");
		int a,b;
		a= s.nextInt();
		b= s.nextInt();
		Arth a1=new Arth();
		int r=a1.add(a,b);
		System.out.println("addition="+r);

		System.out.println("product="+a1.mul(a,b));
	}
}
