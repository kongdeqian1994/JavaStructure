/* Write a method to replace all spaces in a string with '%20"*/
/* Truelength means the real length of input string, we can add some ' '
 * in the end of string because we want to hold addition character */
public class ReplaceBlankPartOfString {
	public static String Replaceblank(String input, int truelength){
		char[] chararray = input.toCharArray();
		int countforlength = 0;
		for (int i = 0; i < truelength; i++){
			if(chararray[i] == ' '){
				countforlength = 2 + countforlength; 
			}
		}
		char[] result = new char[truelength + countforlength];
		for (int j  = 0,k = 0; j < truelength&&k < result.length; j++, k++){
			result[k] = chararray[j];
			if(chararray[j] == ' '){
				result[k] = '%';
				result[k + 1] = '2';
				result[k + 2] = '0';
				k = k + 2;
			}
			
		}
		return new String(result);
	}
	public static void main(String args[]){
		String input = "Mr John Smith     ";
		String result = ReplaceBlankPartOfString.Replaceblank(input,13);
		System.out.println(result);
		
		
	}

}
