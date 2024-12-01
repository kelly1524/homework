package homework2;

public class EX02_13 {
	public static void main(String[] args) {
		double marathon = 42.195; // 실수형 기본 타입인 double 타입 8bytes 크기 메모리 할당, 이름은 marathon 그 안에 42.195 값 초기화
		float halfMarathon = 21.0975f; // 실수형 float 타입 4bytes 크기 메모리 할당, 이름은 halfMarathon 그 안에 21.0975 값 초기화
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다."); // 변수를 값으로서 사용하여 출력
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다."); // 변수를 값으로서 사용하여 출력
	}
}
