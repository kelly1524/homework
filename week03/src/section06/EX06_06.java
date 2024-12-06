package homework;

public class EX06_06 {
	public static void main(String[] args) {
		// 값을 알 때의 배열 선언 및 생성
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		// 서로 참조할 경우 저장된 값을 임시로 보관해놓을 저장 공간 새엇ㅇ
		int temp = 0;
		// 버블 정렬의 경우 첫 검사시 9번 앞뒤 숫자 비교 반복
		// 두번째 검사시 8번 앞뒤 숫자 비교 반복
		// 행이 늘어날수록 숫자비교가 1씩 줄어드는 규칙을 이용하여
		// 이중 for문 작성
		for(int i = arr.length -1; i > 0; i--) {
			for(int j = 0; j < i; j ++){
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	
		System.out.println("정렬 후 출력 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}
}
