package homework;

import java.util.Arrays;

public class EX06_10 {
	public static void main(String[] args) {
		// 값이 들어있는 배열을 heap 메모리에 생성한다
		int[] arr01 = {1, 2, 3};
		// arr01 의 참조값을 arr02가 갖게 된다
		int[] arr02 = arr01;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01)); 
		// arr02의 참조값을 통해 배열에 접근한다.
		// 이 때 이 배열은 arr01도 참조하고 있는 배열이다
		arr02[1] = 10;
		// 1번 인덱스의 값이 두 배열 모두 10으로 변경되었다
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		
	}
}
