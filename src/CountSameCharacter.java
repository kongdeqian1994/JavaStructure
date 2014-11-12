/* not finish*/
public class CountSameCharacter {
	public static String countcharacter(String input){
		int count = 0;
		int index = 0;
		while (index < input.length() - 1){
			if(input.charAt(index) == input.charAt(index+1)){
				count++;
				input = input.substring(index,index + count + 1) + count;
			}
			else{
				count = 0;
				
			}
		}
		return null;
	}
	public static void main(String arg[]){
		System.out.println("index "+ 2);
		
	}

}
