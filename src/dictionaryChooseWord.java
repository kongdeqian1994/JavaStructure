import java.util.Set;
/*Apple pie example: From Applepie to Apple pie*/

public class dictionaryChooseWord {
	public static String chooseword(String input, Set <String> dic){
		int indexend = 0;
		int indexbegin = 0;
		String result = null;
		
		for(indexbegin = 0; indexbegin < input.length(); indexbegin++ ){
			if (dic.contains(input.substring(indexbegin,indexend))){
				indexbegin = indexend;
				result = result + input.substring(indexbegin,indexend) +" ";
				
			}
		}
		return result;
	}

}
