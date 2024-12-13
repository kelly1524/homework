package section12;

public class Person {
	Phone3 p; // 사람 객체는 폰 타입의 저장 공간을 하나 갖는다. Phone 객체를 참조할 수 있음. 그건 내 폰임

	public Person(Phone3 p) {
		super();
		this.p = p;
	}

	void buyNewPhone(Phone3 p) {
		this.p = p;
		System.out.println("= = = = = = = = = =");
		System.out.println("새 폰을 샀습니다!");
	}
	// Phone을 대입할 건데 그 phone이 파인애플 폰인지 쓰리스타 폰인지에 따라 각 오버라이딩 된 메서드를 호출하겠다
	void turnOnPhone() {
		p.powerOn();
	}
	
	void turnOffPhone() {
		p.powerOff();
	}
	
	void wathUtube(){
		if(p.isOn()) {
			p.watchUtube();
		}else {
			System.out.println("폰이 꺼져 있기 때문에 U튜브를 볼 수 없습니다.");
		}
	}
	
	void chargePhone() {
		p.charge();
	}
	
	// 핵심. Person 객체는 Phone 객체를 받을 수 있는 저장 공간을 가지고 있으며
	// 그 Phone 저장 공간이 참조할 Phone은 무슨 클래스로 만들어진 객체인지 알 수 없지만
	// 우리는 만들어지는 Phone 객체의 참조값을 통해 오버라이딩된 메서드를 호출할 수 있어
	// 좋다! ㅋ
	
	
	
}
