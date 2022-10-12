import java.util.*;

public class KeyPair {
	public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.isEmpty()) {
				map.put(x - arr[i], i);
			} else if (map.containsKey(arr[i])) {
				return true;
			} else {
				map.put(x - arr[i], i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int x = 16;
		int Arr[] = { 1, 4, 45, 6, 10, 8 };
		System.out.println(hasArrayTwoCandidates(Arr, Arr.length, x));
	}

}
