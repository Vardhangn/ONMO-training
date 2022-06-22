package j;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int[] numbers = {2,3,2,1,3,4,5,6,7,9};
		int sum = 0;
		double average;
		for(int number:numbers) {
			sum+=number;
		}
		int arrayLength = numbers.length;
		average = ((double)sum/(double)arrayLength);
		System.out.println("sum="+sum);
		System.out.println("average="+average);
	}

}
