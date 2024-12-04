package section3;

public class EX03_13 {
	public static void main(String[] args) {

		int a = 10; // stack 메모리 4btyes 10 초기화
		int b = 10; // stack 메모리 4bytes 10 초기화
		
		System.out.println(a > b); // a가 b보다 크냐? false
		System.out.println(a <= b); // a가 b보다 작거나 같냐? true
		System.out.println(a == b); // a랑 b랑 같냐? true
		System.out.println(a != b); // a랑 b랑 같지 않냐? false
	
	}
}
