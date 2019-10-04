/*
*Java method that computes the angle between the hour hand
*and the minute hand on a traditional analogue clock
*
*Angle should be measured counter-clockwise from hour to minute hand
*
*/


public class Ws1Ex3
{
	public static double timeToAngle(double hours, double minutes, double seconds)
	{
		return (hours%12 * 30 + 360 + 0.5 * (minutes+seconds/60) - (minutes+seconds/60) * 6 )%360;
	}

	/** Printing different areas according to the radius*/
	public static void main(String[] args)
	{
		System.out.println(timeToAngle(9,00,00));
		System.out.println(timeToAngle(3,00,00));
		System.out.println(timeToAngle(18,00,00));
		System.out.println(timeToAngle(1,00,00));
		System.out.println(timeToAngle(2,30,00));
		System.out.println(timeToAngle(4,41,00));
		System.out.println(timeToAngle(0,00,20));
		System.out.println(timeToAngle(13,05,27.2727272727));
	}
} 