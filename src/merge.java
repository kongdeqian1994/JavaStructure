import java.util.Arrays;


public class merge {
	public static void mergeint(int[] a, int[] b, int lasta, int lastb) {
		int lastresult = lasta + lastb - 1;
		while (lastresult >= 0) {
			if (a[lasta] > b[lastb]) {
				a[lastresult] = a[lasta];
				lasta--;
				lastresult = lastresult - 1;
			} else {
				a[lastresult] = b[lastb];
				lastb--;
				lastresult = lastresult - 1;
			}
		}
	}
	public static void main(String args[]){
		int[] a = new int[100];
		int[] b = {0,3,9};
		int lasta = 4;
		int lastb = 2;
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 6;
		a[4] = 7;
		mergeint(a,b,lasta,lastb);
		System.out.print(Arrays.toString(a));
	}

}
