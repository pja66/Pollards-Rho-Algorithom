
public class Factor {


	public static void main(String[] args) {
		int n = 1037;
		int start = 44;
		int i =1;


		int x = func(n,i, start);
		int y = func(n,2*i, start);

		System.out.print(x);
		System.out.print(y);
	  }


	public int func(int n, int i, int start)
	{

		if(i-1 == 0)
		{
			return (int)Math.pow(start, 2) - 1;
		}
		else
		{
			return (int)Math.pow(func(n,i-1, start), 2) - 1;
		}

	}

}
