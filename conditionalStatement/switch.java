package test;

public class Example {
	public static void main(String[] args) {
		int day = 6;
		String dayString;
		
		switch(day) {
			case 1:
				dayString = "월요일";
				break;
			case 2:
				dayString = "화요일";
				break;
			case 3:
				dayString = "수요일";
				break;
			case 4:
				dayString = "목요일";
				break;
			case 5:
				dayString = "금요일";
				break;
			default:
				dayString = "휴일";
				break;
		}
		
		System.out.println(dayString);
	}
}