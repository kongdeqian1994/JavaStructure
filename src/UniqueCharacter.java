/* Implement an algorithm to determine if a string 
 * has all unique characters.*/
/* this method is going to check whether we have all unique characters
 * in a string the unique can show many times the bottom line is the input string
 * must have all unique character in ASCII*/
public class UniqueCharacter {
	public static boolean CheckCharacter(String input){
		if (input.length() < 128){
			return false;
		}
		int index = 0;
		boolean [] checkchar = new boolean[128];
		for (index = 0; index < input.length() -1; index++){
			int charASCII = input.charAt(index);
			checkchar[charASCII] = true;
			
		}
		for (int i = 0; i < checkchar.length; i++){
			if(checkchar[i]==false){
				return false;
			}
		}
		return true;
		
	}
/*This method will check that we have only one unique character in the input 
 * String; therefore, we need to make sure that the length of string is longer
 * 128 is false*/
	public static boolean CheckCharacter2(String input){
		if (input.length() > 128){
			return false;
		}
		boolean [] checkchar = new boolean[128];
		
		for (int index = 0; index<input.length(); index++ ){
			int charASCII = input.charAt(index);
			if(checkchar[charASCII] == true){
				return false;
			}
			checkchar[charASCII] = true;
			
		}
		return true;
	}
	public static void main(String args[]){
	//	char ASCIICOT = 34;
	//	char ASCIISLSH = 92;
		String input ="abvca";
				System.out.println(UniqueCharacter.CheckCharacter2(input));
		
	}

}
