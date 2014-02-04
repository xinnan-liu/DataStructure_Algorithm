package sorting;

import java.util.Random;

public class solution {
	public static int partition(int[] list, int left, int right) {
		int pivot = (list[left] + list[right]) / 2;//set the pivot
		while (right > left) {
			while (left <= right && list[left] <= pivot)//find the first number not bigger than the pivot
				left++;
			while (left <= right && list[right] > pivot)//find the first number bigger than the pivot
				right--;
			if (right > left)// swap
			{
				{
					int temp = list[right];
					list[right] = list[left];
					list[left] = temp;
				}
			}
		}
		//if all number are not bigger than the pivot,
		//it means the first and last must be the biggest number
		//so eliminate the last 	
		if (left == list.length) {
			return left - 2;
		} else {
			return left - 1;
		}
	}

	public static void quick_sort(int[] list, int left, int right) {
		if (right > left) {
			if (right - left == 1) {//when the list only have two number, just compare and swap instead using the recursion
				if (list[left] > list[right]) {
					int temp = list[left];
					list[left] = list[right];
					list[right] = temp;
				}
			} else {//recursion
				int index = partition(list, left, right);
				quick_sort(list, left, index);
				quick_sort(list, index + 1, right);
			}
		}
	}

	public static void quick_sort(int[] list) {
		quick_sort(list, 0, list.length - 1);
	}

	public static void main(String[] args) {
		int[] list = new int[10];
		Random r = new Random();
		for (int i = 0; i < list.length; i++) {//generate the random number
			list[i] = r.nextInt(100);
		}
		quick_sort(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
