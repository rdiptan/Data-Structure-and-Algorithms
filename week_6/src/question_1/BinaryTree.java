package question_1;

public class BinaryTree {
	public static boolean checkIfBalanced(int head[], int root[]) {

		boolean lastVal = true;
		for (int i = 0; i < head.length; i++) {
			boolean currentCheck = doesBothChildExists(root, findIndex(root, head[i]));

			lastVal = lastVal && currentCheck;
		}

		return lastVal;
	}

	public static boolean doesBothChildExists(int root[], int idx) {

		int left = 2 * idx + 1;
		int right = 2 * idx + 2;

		try {
			return root[left] != -1 && root[right] != -1;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	public static int findIndex(int arr[], int t) {
		if (arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;
		while (i < len) {
			if (arr[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] head = { 5, 9 };
		int[] root = { 1, 4, 5, -1, 2, 3, 9, -1, -1, -1, -1, -1, -1, 2, 7 };

		System.out.println(checkIfBalanced(head, root));
	}
}
