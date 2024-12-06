package homework;

import java.util.Arrays;
import java.util.Comparator;

public class EX06_09 {
	public static void main(String[] args) {
		// Integer 참조 타입의 배열 생성
		// heap 메모리에 올라간 기본 타입 숫자들을 참조하는 참조값들이 나열된다
		// 그리고 그 시작주소 값이 arr에 저장된다
		Integer[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
		// Arrays에 있는 static 메서드를 호출한다. Comparator 를 사용하여
		// 내림차순 정렬한다
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));
	}
}
