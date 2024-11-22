public class FindSmallestElement{
	public static void main(String[] args){
		int[] num = {1,0,-100,-20000,100,2,-1000};
		int lowest = num[0];
		for(int i=0; i<num.length; i++){
			if(lowest<num[i]){
				continue;
			}
			else{
				lowest=num[i];
			}
		}
		System.out.println(lowest);
	}
}