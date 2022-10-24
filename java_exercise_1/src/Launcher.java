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
			System.out.println("unknown command");
			input = scanner.nextLine();
		}

		System.out.println("Vous avez tapé : " + input);

		System.out.print(fibo(10));

	}
}
