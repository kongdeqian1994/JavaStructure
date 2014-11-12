
public class reverseString {
	public static String reversestring(String input){
		char[] result = new char[input.length()];
		int index = 0;
		while(index < input.length()){
			result[index] = input.charAt(input.length() - index - 1);
			index++;
		}
		return new String(result);
	}
	public static void main(String args[]){
		String input = "Dai Ming Xi is BigSb";
		System.out.println(reverseString.reversestring(input));	
	}
}
