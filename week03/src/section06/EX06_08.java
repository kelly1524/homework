package homework;

import java.util.Arrays;

public class EX06_08 {
	public static void main(String[] args) {
		// Heap 메모리에 배열 생성
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
		// Arrays class 의 static 메서드인 sort 로
		// arr 배열의 참조값을 통해 배열을 오름차순 정렬
		Arrays.sort(arr);
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
		

	}
}
