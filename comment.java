package chap01;

public class Hello {
	public static void main(String[] arp) {
		// 행 단위 주석
		
		/*
		 * 블록 단위 주석
		 */
		
		/**
		 * 문서화 주석 - 클래스, 인터페이스 멤버 각각 하나만 작성, 선언하기 바로 전에 작성
		 * add 메소드는 두 수를 더합니다.
		 * @param a 첫 번째 정수
		 * @param b 두 번째 정수
		 * @return 두 정수의 합
		 */
		public int add(int a, int b)
		{
			return a + b;
		}
	}
}