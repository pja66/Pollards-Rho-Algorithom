
public class Factor {

	public static void main(String[] args){
		
	
		int n = 25; 
		int start = (int)(Math.random()*n-1); 
		int i = 1;
		int gcd = n;
		int x;
		int y;
		int value;
		
		
	while(gcd == n)
	{
		start = (int)(Math.random()*n-1); 	
		x = func(n,i, start);
		y = func(n,i*2, start);
		value = Math.abs(x-y);
		gcd = GCD(n,value);
		
		
		while(gcd ==1) 
		{
			i = i +1;
			x = func(n,i, start);
			y = func(n,i*2, start);
			value = Math.abs(x-y);
			gcd = GCD(n,value);
		}
	}
		
	System.out.println("This is a factor of " + n +": "+ gcd);
}
	
	
	public static int func(int n, int i, int start)
	{
		if(i-1 == 0)
		{
			return ((int)Math.pow(start, 2) - 1)%n;
		}
		else
		{
			return ((int)Math.pow(func(n,i-1, start), 2) - 1)%n; 
		}

	}
	
	public static int GCD(int n, int value)
	{
		if(value == 0)
			return n;
		else
			return GCD(value, n%value);
	} 
}
