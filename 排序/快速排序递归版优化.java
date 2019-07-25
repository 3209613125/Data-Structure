//在待排序序列可以被分割成均匀的两部分时快排效率最高，但是这显然不太符合实际，万一本来就是有序的呢？那岂不是浪费太多时间了吗？
//那么问题就在于如何把待排序序列均匀的分割成两部分？
//优化1：三数取中法 array[mid] <= array[low] <= array[high]
//优化2：在排序过程中，待排序序列会逐渐趋于有序。如果某一段序列已经有序，再对这一部分序列进行快排，就会变成冒泡排序。所以到达某一个区间后用直接插入排序。
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

public static void insertSort(int[] array, int start, int end) {
	for (int i = start + 1; i <= end; i++) {
		int temp = array[i];
		int j = 0;
		for (j = i-1; j >= start; j--) {
			if (array[j] > temp) {
				array[j + 1] = array[j];
			}else {
				break;
			}
		}
		array[j + 1] = temp;
	}
}

public static void quick(int[] array, int start, int end) {

	//假设对start到end这部分序列有16个元素，已经有序则进行直接插入排序
	if (end - start + 1 <= 16) {
		insertSort(array, start, end);
		return;
		//如果这部分序列用直接插入排序完成了，那么剩下的函数不需要再进行了
	}
	
	//每次找基准之前先三数取中一下
	medianOfThree(array, start, end);

	//递归了多少次，par就保存了多少次
	int par = partion(array, start, end);//一趟快排完毕
	//递归左边，首先得保证左边有两个数据元素以上
	if (par > start + 1) {
		quick(array, start, par - 1);
	}
	//递归右边
	if (par < end - 1) {
		quick(array, par + 1, end);
	}
}

public static void quickSort1(int[] array) {
	quick(array, 0, array.length - 1);
}

//三数取中法法找基准
public static void medianOfThree(int[] array, int low, int high) {
	int mid = (low + high) / 2;
	if (array[mid] > array[low]) {
		swap(array, low, mid);
	}
	if (array[low] > array[high]) {
		swap(array, low, high);
	}
}

public static void swap(int[] array, int low, int high) {
	int temp = array[low];
	array[low] = array[high];
	array[high] = temp;
}


//快速排序特性总结：
//时间复杂度：最好：O(n*logn) 最坏：O(n^2)
//空间复杂度：最好：O(logn) 最坏：O(n) -> 123456789
//稳定性：不稳定
