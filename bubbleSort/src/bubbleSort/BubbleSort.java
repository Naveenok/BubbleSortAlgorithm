/**
 * 
 */
package bubbleSort;

public class BubbleSort {

	public void bubblesort(int[] array, int n) {
		Integer first = 0;
		Integer second = 0;
		Integer temp = 0;

		while (n > 0) {
			int flag = 0;
			for (int i = 0; i < n - 1; i++) {
				first = array[i];
				second = array[i + 1];
				if (first > second) {
					temp = first;
					array[i] = second;
					array[i + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
			n = n - 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		int[] array = new int[] { 12, 2, 3, 4, 5 };
		BubbleSort b = new BubbleSort();
		b.bubblesort(array, 5);
	}
}
