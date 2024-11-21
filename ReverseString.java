public class ReverseString{
	public static void main(String[] args){
		String str = "Shambu Linga";
		System.out.println("---Before Reversing---");
		System.out.println(str);
		System.out.println();
		System.out.println("---After Reversing---");
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}