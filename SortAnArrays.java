import java.util.*;
public class SortAnArrays{
	public static void main(String[] args){
		int[] num = {100,-20,1,2,5};
		System.out.println("---Before Sorting---");
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+",");
		}
		
		System.out.println();
		Arrays.sort(num);
		System.out.println();
		System.out.println("---After Sorting---");
		for(int j=0; j<num.length; j++){
			System.out.print(num[j]+",");
		}
		System.out.println();
	}
}