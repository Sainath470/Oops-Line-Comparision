///"Welcome to the line computation program "

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


		//method to calculate length of line
		 static double calLength(double x1, double y1, double x2, double y2)
		{

			double LengthOfLine=(int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
			return LengthOfLine;

		}


				//main method
				public static void main(String args[])
				{

					double x1=userInput1("Enter the x1 co-ordinate: ");
					double y1=userInput1("Enter the y1 co-ordinate: ");
					double x2=userInput1("Enter the x2 co-ordinate: ");
			      		double y2=userInput1("Enter the y2 co-ordinate: ");
		       					double p1=userInput1("Enter the p1 co-ordinate: ");
               				double q1=userInput1("Enter the q1 co-ordinate: ");
               				double p2=userInput1("Enter the p2 co-ordinate: ");
               				double q2=userInput1("Enter the q2 co-ordinate: ");

						//passing the values by calling method and assigning to variables
						int len1=(int)calLength(x1, y1, x2, y2);
						int len2=(int)calLength(p1, q1, p2, q2);

						System.out.println("Length of line 1: "+len1);
						System.out.println("Length of line 2: "+len2);

						Integer L1=Integer.valueOf(len1);
						Integer L2=Integer.valueOf(len2);

						int Com=L1.compareTo(L2);

						System.out.println("equality of 2 lengths is: "+L1.equals(L2));
						System.out.println("Comparing 2 lengths : "+Com);

						//comparing which line length is greater than other or equal
						if(Com<0)
						{

								System.out.println("Line 1 Length is less than Line 2 Length");

						}
						else if(Com>0)
							{
								System.out.println("Line 1 Length  is greater than Line 2 Length ");
							}
							else
									System.out.println("Both the Lengths are equal");
				}

}
