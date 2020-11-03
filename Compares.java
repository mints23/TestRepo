import java.util.*;

public class Compares {
	
	static String str;
	
	public static void main(String args[]) {

		List<Integer> arr = new ArrayList();
		arr.add(17);
		arr.add(4);
		arr.add(8);
		int[] a = new int[arr.size()];
		int cout=0;
		for(Integer ra:arr) {
			a[cout]=ra;
cout++;
		}

		int left = 0;

		int right = a.length - 1;

		int count = 0;

		while (left < right) {

			if (a[(left)] % 2 == 0) {

				left++;

				continue;

			}

			if (a[right] % 2 == 1) {

				right--;

				continue;

			}

			int temp = a[(left)];

		 a[left] = a[right];

		a[right] = temp;

			left++;

			right--;

			count++;

		}

		System.out.println(count);

	}
	


	
}


