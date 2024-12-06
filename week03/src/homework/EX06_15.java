package homework;

public class EX06_15 {
	public static void main(String[] args) {
		// main method frame에 지역 변수 arr 생성
		// 거기에 5x5 크기의 배열 heap 메모리에 생성
		int[][] arr = new int[5][5];
		// 배열에 순서대로 저장할 때 값으로 사용될 변수 선언
		int count = 1;
		// 순서대로 배열에 정수 저장
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		// 배열의 길이만큼 출력한 뒤 줄바꿈
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		
		
		
	}
}
