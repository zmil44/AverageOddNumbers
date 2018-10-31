
public class AverageOddNumbers {

	public static void main(String[] args) {
		int total=getTotal();
		int numberOfNumbers=getNumberOfNumbers();
		double average=getAverage(total,numberOfNumbers);
		displayOutput(total,average);
	}
	
	private static int getTotal()
	{
		int count=1,total=0;
		while(count<=15)
		{
			if(count%2!=0)
			{
				total+=count;
			}
			count++;
		}
		return total;
	}

	private static int getNumberOfNumbers()
	{
		int count=1,numOfNumbers=0;
		while(count<=15)
		{
			if(count%2!=0)
			{
				numOfNumbers++;
			}
			count++;
		}
		return numOfNumbers;
	}
	
	private static double getAverage(int total, int numOfNumbers)
	{
		double average=total/numOfNumbers;
		return average;
	}
	
	private static void displayOutput(int total, double average)
	{
		System.out.println("The total of all odd numbers between 1 and 15 is: "+total);
		System.out.println("The average of all odd numbers between 1 and 15 is: "+average);
	}
}
