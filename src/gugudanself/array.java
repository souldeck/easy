package gugudanself;

public class array {
	//메소드의 정의 부분
	public static void numbering(int start, int fin){
		int i = start;
		int j = fin;
			while(i<j) {
				System.out.println(i);
				i++;
			}

		}
	
	//메소드의 호출부분
	public static void main(String[] args) {
		numbering(3, 7);  
		numbering(2, 5);
		numbering(1, 3);
		
	}
}
		