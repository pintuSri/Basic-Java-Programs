public class SumOfArrayElements{
	public static void main(String[] args){
		int[] num = {1,2,3,4,5,100};
		int sum = 0;
		for(int i=0; i<num.length; i++){
			sum = sum+num[i];
		}
		System.out.println(sum);
	}
}