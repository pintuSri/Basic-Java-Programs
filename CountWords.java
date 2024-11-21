public class CountWords{
	public static void main(String[] args){
		String str = "I am Software Test Engineer";
		String[] temp=str.split(" ");
		System.out.println("Number of word in '"+str+"' :  "+temp.length);
	}
}