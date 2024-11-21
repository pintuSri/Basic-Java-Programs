public class ConvertStringToArray{
	public static void main(String[] args){
		String str = "MyNewProject";
		char[] letters=str.toCharArray();
		System.out.println("Number of letters in '"+ str+"' :  "+letters.length);
		System.out.println("Printing Charectors one by one");
		for(int i=0; i<letters.length; i++){
			System.out.println("'"+letters[i]+"'");
		}
	}
}