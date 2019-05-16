package gugudanself;

public class array {
	public static void main(String[] args) {
		// 배열 만들기
		// 배열의 이름은 클래스 그룹. 각각의 이름 지정. 크기는 3
		String[] classGroup = { "이경하", "오경화", "로버"} ;
		// 배열 꺼내기
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
//에러     System.out.println(classGroup[3]); 
	
		// 배열의 크기를 아라보자		
		String[] classGroup2 = new String[4];
		classGroup[0] = "이경하"; //값을 초기화 시키는 과정 
		System.out.println(classGroup2.length);
		System.out.println(classGroup2[1]);//=null. 값을 지정해주지 않은 배열.
		classGroup[1] = "오경화";
		System.out.println(classGroup2.length);
		classGroup[2] = "로버";
		System.out.println(classGroup2.length);
	
	    // 배열과 반복문의 결합
		String[] members = {"냥식","냥순","쌔미"};
		for(int i=0; i<members.length;i++) { 
			//i<3일때까지 i[n] 배열 안의 결과값을 출력하라
			String member = members[i];
			System.out.println(member+"고양이가 사료를 먹었습니다.");
		}
	}
}

		