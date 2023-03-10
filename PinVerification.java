import java.util.Scanner;
class PinVerification
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		int actpin = 1234;
		int att = 0;
		do
		{
			System.out.println("Enter Pin");
			int pin = s.nextInt();
			if (actpin == pin)
			{
				System.out.println("Login Success");
				break;
			}
			System.out.println("Wrong Pin, Try Again");
			att++;
		}
		while (att<3);
	}
}
