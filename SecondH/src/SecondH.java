
public class SecondH {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 400, 30,100 };
		int l = arr.length;
		int max = 0, secondMax = 0;
		for (int i = 0; i < l; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];

			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second Max is:" + secondMax);
	}
}
