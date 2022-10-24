import java.util.Scanner;

public class Launcher 
{
	public static int fibo(int n) 
	{
		int a = 0;
		int b = 1;
		int c= 0;

		for(int i = 2; i <= n; i++) 
		{
			c = a + b;
			a = b;
			b = c;
		}
		//System.out.println(c);
		return c;
	}

	public static void main(String[] args) 
	{
		System.out.println("Bienvenue");

		var scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		while(!"quit".equals(input)) 
		{
			if("fibo".equals(input)) {
				input = scanner.nextLine();
				System.out.println(fibo(Integer.parseInt(input)));
			}
			else{
				System.out.println("Unknown command");
			}
			input = scanner.nextLine();
		}

		//System.out.print(fibo(10));

	}
}
