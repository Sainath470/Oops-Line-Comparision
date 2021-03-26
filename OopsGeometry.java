//"Welcome to the line computation program "
import java.util.Scanner;
public class OopsGeometry
{

	//method to take user input
	static double userInput1(String x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(x);
		double input=sc.nextDouble();
		return input;
	}

		//method to print the length of the line
		public void toPrint(double x)
		{
				System.out.println("Length of the line is: "+x);

		}

				//main method
				public static void main(String args[])
				{

					double x1=userInput1("Enter the x1 co-ordinate: ");
					double y1=userInput1("Enter the y1 co-ordinate: ");
					double x2=userInput1("Enter the x2 co-ordinate: ");
					double y2=userInput1("Enter the y2 co-ordinate: ");

					double LengthOfLine=(int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

					//creating obj to call toPrint method
					OopsGeometry Geo=new OopsGeometry();
					Geo.toPrint(LengthOfLine);
				}

}
