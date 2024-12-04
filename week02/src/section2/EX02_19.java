package homework2;

public class EX02_19 {
	public static void main(String[] args) {
		boolean isStudent = true; // 1byte 메모리 크기 할당. 그 이름은 isstudent true로 값 초기화
		
		if(isStudent) { // isStudent 의 값이 true 라면
			System.out.println("저는 학생입니다."); // () 안의 값 출력 후 줄바꿈 --> true 니까 이게 출력된다.
		}else { // false 라면 
			System.out.println("저는 학생이 아닙니다."); // () 안의 값 출력 후 줄바꿈
		}
	}
}
