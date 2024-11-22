public class ArrayAverage{
	public static void main(String[] args){
		int[] num = {1,2,3,4,50};
		float sum = 0;
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+", ");
			sum = sum + num[i];
		}
		System.out.println();
		float avg = (sum/(num.length));
		System.out.println("Average of an above numbers: "+avg);
	}
}