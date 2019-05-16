package gugudanself;

public class array {
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = -i1;
		int i3 = -i1; 
		System.out.println("i3=" +i3);
		//전위증감연산자. 값이 먼저 증가한 후 대입.
		System.out.println("전위증감연산자");
		System.out.println("i4=++i3");
		int i4 = ++i3; //i3이 6으로 증가, i4에 6대입.
		//i3 = i3 + 1; 
		System.out.println("i3=" + i3);
		System.out.println("i4=" + i4);
		
		
		//후위 증감 연산자. 대입후 값이 증가. 
				System.out.println("후위증감연산자");
				System.out.println("i3=" + i3);
				System.out.println("i5=i3++");
				int i5 = i3++; 
				System.out.println("i3=" + i3);
				System.out.println("i5=" + i5);
		
	}
}