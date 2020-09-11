import java.util.Scanner;

public class PresonsWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		/* Type your code here. */

		double[] weight = new double[4];

		System.out.println("Enter weight 1:");
		double weight1 = scnr.nextDouble();

		System.out.println("Enter weight 2:");
		double weight2 = scnr.nextDouble();

		System.out.println("Enter weight 3:");
		double weight3 = scnr.nextDouble();

		System.out.println("Enter weight 4:");
		double weight4 = scnr.nextDouble();

		System.out.println("Enter weight 5:");
		double weight5 = scnr.nextDouble();

		System.out.println(
				"You entered:" + " " + weight1 + " " + weight2 + " " + weight3 + " " + weight4 + " " + weight5 + " ");

		System.out.println("");
		double totalWeight = weight1 + weight2 + weight3 + weight4 + weight5;
		System.out.println("Total weight:" + " " + totalWeight);

		double averageWeight = totalWeight / 5;
		System.out.println("Average weight:" + " " + averageWeight);

		double max = weight[0];
		double min = weight[0];
		// iterate and compare from array index 1
		for (int i = 1; i < weight.length; i++) {
			if (weight[i] > max) {
				max = weight[i];
				
			}
		}

		System.out.println("Max weight:" +  max);

	}

}
