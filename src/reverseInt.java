
public class reverseInt {
	public static int reverseint(int input){
		int digit = 0;
		int result = 0;
		while(input !=0 ){
			digit = input%10;
			input = input/10;
			result = result*10+digit;
		}
		return result;
	}
	public static void main(String args[]){
		int input = 12345;
		System.out.println(reverseInt.reverseint(input));
	}

}
