package gugudanself;

public class array {
	//메소드의 정의 부분
	public static void numbering(){ 
		//메소드의 이름을 numbering이라 지정해줌 
		// numbering() 소괄호가 비어있어 함수의 결과물을 저장가능
		int i=0;
		while(i<10) {
			System.out.println(i); //결과값 출력
			i++;
		}
	}
	//메소드의 호출부분
	public static void main(String[] args) {
		numbering();  
		numbering();
		numbering();
		
	}
}
		