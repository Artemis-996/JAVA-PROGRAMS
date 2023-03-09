import java.util.Scanner;
class EvenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Number : ");
		int end = sc.nextInt();

		while (start<=end)
		{
			if(start%2 == 0)
			{
				System.out.println(start);
			}
		 start++;
		}
	}
}
