package gugudanself;

public class array {
	//메소드 정의에서 sysout을 호출로 빼내보자
	public static  String numbering(int start, int fin){
		int i = start;
		String output=""; //빈 이름 지정
			while(i<fin) {
				output+=i;
				// output 빈이름에 i에 지정된 숫자를 계속 더해주자. 
				// i<fin될때까지
				i++;
			}
			 return output; //결과값을 되돌려준다. 라는 의미

		}
	
	//메소드의 호출부분
	public static void main(String[] args) {
		String result=numbering(2, 8);
		System.out.println(result);
		//2이상 8미만까지의 숫자 출력
		result=numbering(5,11);
		System.out.println(result);
		//5이상 11미만까지의 숫자를 출력해 result에 덮어씌우기
	}
}
		