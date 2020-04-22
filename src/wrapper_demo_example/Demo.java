package wrapper_demo_example;

public class Demo {

	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=10;
		Integer i3=9;
		Integer i4=new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		System.out.println("Using equals method");
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s="100";
		int x=Integer.parseInt(s);//it is available in all the 8 wrapper classes except char 
		System.out.println(x);
		x=9999;
		s=x+"";
		System.out.println(s);
		i1=89;
		x=i1;//autoboxing
		System.out.println(x);
		System.out.println(Integer.toBinaryString(10));
		Float f=i1.floatValue();
		System.out.println(f);
		f=121.2222f;
		x=f.intValue();
		//Practicing with long double float
		String s1="100";
		long xl=Integer.parseInt(s1);//it is available in all the 8 wrapper classes except char 
		System.out.println(xl);
		xl=666;
		s1=xl+"";
		System.out.println(s1);
		i2=98;
		xl=i2;//autoboxing
		System.out.println(xl);
		System.out.println(Integer.toBinaryString(10));
		Float f1=i2.floatValue();
		System.out.println(f1);
		f1=121.2222f;
		xl=f1.intValue();
		

	}

}
