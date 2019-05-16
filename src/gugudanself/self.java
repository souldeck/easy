package gugudanself;
import java.util.Scanner;

public class self {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은?");
		Scanner s=new Scanner(System.in);
		int number = s.	nextInt();
		System.out.println("숫자:" + number);
		if (number <2) {
			System.out.println("2에서9까지의 숫자를 입력하십시오");
		} else if (number > 9) {
			System.out.println("2에서9까지의 숫자를 입력하십시오");
		} else {
			System.out.println(number*1);
			System.out.println(number*2);
			System.out.println(number*3);
			System.out.println(number*4);
			System.out.println(number*5);
			System.out.println(number*6);
			System.out.println(number*7);
			System.out.println(number*8);
			System.out.println(number*9);
		
			
		}

	}

}
