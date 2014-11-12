/*This program makes int array from 1 to 100 if number can be divided by 3
 * print Fuzz if number can be divided by 5 print Buzz. if the number can 
 * be both divided by 3 and 5 print FuzzBuzz
 *  */
public class FUZZBUZZ {
	public static int[] MakeintArray() {
		int[] OneHundred = new int[100];
		for (int i = 0; i < OneHundred.length; i++) {
			OneHundred[i] = i + 1;
		}
		return OneHundred;
	}
	public void makeFUZZBUZZ(){
		int[] OneHundred = FUZZBUZZ.MakeintArray();
		for (int i = 0; i < OneHundred.length; i++ ){
			if (OneHundred[i]%3 == 0 && OneHundred[i]%5 == 0){
				System.out.print("FUZZBUZZ ");
			}
			else if(OneHundred[i]%3 == 0){
				System.out.print("Fuzz ");
			}
			else if(OneHundred[i]%5 == 0){
				System.out.print("Buzz ");
			}
			else{
			    System.out.print(OneHundred[i]+" ");
			}
		}
	}
	public static void main(String args[]){
		FUZZBUZZ result = new FUZZBUZZ();
		result.makeFUZZBUZZ();
	}

}
