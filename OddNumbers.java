import java.util.Scanner;
class  OddNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Starting Point : ");
		int start = sc.nextInt();

		System.out.println("Enter Ending Point : ");
		int end = sc.nextInt();

		while (start<=end)
		{
			if (start%2 == 1)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
