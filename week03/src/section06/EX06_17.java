package homework;

public class EX06_17 {
	public static void main(String[] args) {
		// method stack frame의 지역 변수 score, sum, avg 공간 생성
		// heap 메모리에 생성된 것의 참조값을 저장하거나 초기값으로 값 저장
		int[] score = {90, 92, 93};
		
		int sum = 0;
		double avg = 0.0;
		
		// for-each문으로 sum에 값 누적
		for(int val : score) {
			sum += val;
		}
		// 평균. double로 강제 형변환
		avg = (double)sum / 3;
		System.out.println("총점 : " + sum + "평균 : " + avg);
	}
}
