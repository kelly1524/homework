package section07;

public class EX07_13 {
	public static void main(String[] args) {
		System.out.println(Student.schoolName); // schoolName은 정적 변수이기 때문에 Student만 호출해도 method 영역에서 호출 가능하다
		Student.goToSchool(); // goToSchool은 default이기 때문에 같은 패키지 내에서 사용 가능하며 static 메서드이기 때문에 클래스명으로도 호출이 가능하다
	}
}
