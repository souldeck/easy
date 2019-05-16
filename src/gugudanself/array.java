package gugudanself;

public class array {
	public static void main(String[] args) {
		//반복문 while
		int i = 0; //값 초기화. 통상적으로 i는 반복문을 종료시키기 위한 변수값 지정문자로 쓰임. 
		while(i<1) { // while: 괄호 안의 조건이 true일때 코드를 반복시킨다.
			System.out.println("i실행"+i+"번째");
//가능	    i=++i;
			i++;
			//i=i++ 일시 i=0으로 무한 반복됨. 
			
		}
		//반복문 for
		for(int i2=0; i2<10; i2++) {
			System.out.println("for문실행"+i2+"번쨰");
		}
	}
}