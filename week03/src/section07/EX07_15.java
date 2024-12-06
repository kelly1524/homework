package section07;

public class EX07_15 {
	public static void main(String[] args) {
		Student2 stu1 = new Student2(); // 같은 패키지 내의 Student2 타입의 객체 생성
		stu1.studentName = "김고이"; // 필드 초기화. 김고이
		stu1.hello(); // stu1. 참조값을 통해 hello 메서드 호출. 자기 자신의 멤버 메서드 호출함
		System.out.println("학교는 " + Student.schoolName + "입니다." );
		Student.goToSchool(); // static 메서드이기 때문에 클래스명으로 접근.
		Student2 stu2 = new Student2();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다." );
		Student.goToSchool();
	}
}
