package gugudanself;

public class array {
	public static void main(String[] args) {
		//조건문
		if(true) { //true 안을 가변적으로 만들어줘야 의미있는 코드.
			//만약에 if 뒤에 오는 괄호 안에 들어오는 값이 참이라면 if 따라 오는 중괄호 안의 코드가 실행된다.
			//if () 괄호안에 들어올 명령문은 boolean 외에는 못들어옴. (true, false)
			System.out.println("헬로월드;dhs");
		} if(false){ // = } else { 로 표현할 수도 있음. 
			System.out.println("false");
		}
		
	   boolean flag = false; //가변값 지정
	   if(flag) { //falg = true 일때 중괄호 안 코드가 실행됨 
		   System.out.println("true");
	  // 틀린 코드 } else(flag) {  
	   } else { //flag = false 로 지정할 경우 중괄호 안 코드가 실행됨 	   
		   System.out.println("false");
	   }
	   
	   
	}
}