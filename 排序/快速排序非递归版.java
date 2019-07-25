public static int partion(int[] array, int low, int high) {
	int temp = array[low];
	while (low < high) {
		while (low < high && array[high] > temp) {
			high--;//high有可能会越界
		}
		array[low] = array[high];
		while (low < high && array[low] < temp) {
			low++;
		}
		array[high] = array[low];
	}
	array[low] = temp;
	return low;
}

public static void quickSort2(int[] array) {
	int low = 0;
	int high = array.length-1;
	Stack<Integer> stack = new Stack<>();

	int par = partion(array, low, high);

	if (par > low + 1) {
		stack.push(low);
		stack.push(par - 1);
	}
	if (par < high - 1) {
		stack.push(par + 1);
		stack.push(high);
	}

	while (!stack.isEmpty()) {
		high = stack.pop();
		low = stack.pop();
		par = partion(array, low, high);

		if (par > low+1) {
			stack.push(low);
			stack.push(par-1);
		}
		if (par < high-1) {
			stack.push(par+1);
			stack.push(high);
		}
	}
}
