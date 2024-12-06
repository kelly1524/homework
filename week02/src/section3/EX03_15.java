package section3;

public class EX03_15 {
	public static void main(String[] args) {
		// true 가 1 false 가 0
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("###논리곱###");
		System.out.println(b1 && b2); // 둘 중 하나만 true 니까 false
		System.out.println(b1 && b3); // 둘 다 true 니까 true
		System.out.println(b2 && b4); // 둘 다 false 니까 false
		System.out.println();
		
		System.out.println("###논리합###");
		System.out.println(b1 || b2); // 둘 중 하나만 true 니까 true
		System.out.println(b1 || b3); // 둘 다 true 니까 true
		System.out.println(b2 || b4); // 둘 다 false 니까 false
		System.out.println();

		System.out.println("###배타적 논리합###");
		System.out.println(b1 ^ b2); // 둘 중 하나만 true 니까 true
		System.out.println(b1 ^ b3); // 둘 다 true 니까 true false
		System.out.println(b2 ^ b4); // 둘 다 false 니까 false false
		System.out.println();

	}
}
