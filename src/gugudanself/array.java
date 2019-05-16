package gugudanself;

public class array {
	public static void main(String[] args) {
		//조건문을 이용한 로그인 어플리케이션 만들기
		String id= args[0]; //입력값 받기
		String pw= args[1];
		if(id.equals("RSM")) {
			if(pw.equals("1215")) {
				System.out.println("welcome! RSM");
			} else {
				System.out.println("wrong");
			}
			
		} else {
			System.out.println("wrong");
		}
/* 이 java 프로그램을 cmd ~bin 디렉토리에서 
 * java packageName.javaName (지정한 아이디)RSM (지정한비밀번호)1215 명령문을 실행시킨다. 
 * 아이디가 if문의 조건을 만족시키면 welcome 코드가, 아닐 시 wrong 코드가 실행된다.
 */
	   
	}
}