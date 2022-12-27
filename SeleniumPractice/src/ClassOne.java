
public class ClassOne {
	
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
		
	}
	
	public int sub(int x, int y)
	{
		int z = x-y;
		return z;
		
	}
	
	public void mul(int x1, int y1)
	{
		int z1 = x1*y1;
		System.out.println("Final calculation is "+z1);
		
	}
	
	
	public static void main(String[] args)
	{
		ClassOne obj = new ClassOne();
		int sumresult = obj.sum(10, 5);
		int subresult = obj.sub(10,5);
		obj.mul(sumresult,subresult);
		
		
		
		
	}

}
