/*Not finish Not correct*/
/*we need to use hash map*/
public class IntAdditionValue {
	public static int[] selectValue(int[] input, int value) {
		int[] result = new int[input.length];
		int j = 1;
		int k = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] + input[j] == value) {
				result[k] = input[i];
				result[k + 1] = input[j];
				k = k + 2;
			} else {
				j++;
			}
		}

		return result;
	}
	public static void main(String args[]){
		
	}

}
