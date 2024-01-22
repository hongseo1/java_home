package test03;

public class Exercise03 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가" : "나"; 
		//a:b = ()값이 true면  a false면 나 이지만 
		//앞에 부정 !이 있으므로 정답은 가
		System.out.println(result);
	}

}
