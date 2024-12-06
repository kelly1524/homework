package homework;

public class EX06_14 {
	public static void main(String[] args) {
		// main method stack frame 형태로 stack에 올라감
		// arr 지역 변수 할당 및 배열의 heap 메모리 참조값 대입
		int[][] arr = new int[2][3];
		// 각 배열의 저장 공간에 값 저장
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		// 배열 전체를 가리키는 대표 시작주소값 출력됨
		System.out.println("2차원 배열 : " + arr);
		// 2차원 배열의 1행 주소값 출력됨
		System.out.println("2차원 배열 1행 : " + arr[0]);
		// 2차원 배열의 행 길이 출력됨
		System.out.println("행의 크기 : " + arr.length);
		// 2차원 배열의 1행의 열 크기
		System.out.println("1 행의 열 크기 : " + arr[0].length);
		// 2행의 열 크기
		System.out.println("2 행의 열 크기 : " + arr[1].length);
		// 2차원 배열에 저장된 값 출력
		System.out.println("arr[0][0] = " + arr[0][0]);
	}
}
