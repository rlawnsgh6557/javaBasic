package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("1:가넷, 2:자수정, 3:남옥, 4:다이아몬드, 5:비취, 6:진주, 7:홍옥, 8:감람석, "
				+ "9:청옥, 10:오팔, 11:황옥, 12:터키석");
		System.out.println("태어난 월을 입력 [1-12] : ");
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();

		switch(mode) {
			case 1:
				System.out.println("가넷 입니다.");
				break;
			case 2:
				System.out.println("자수정 입니다.");
				break;
			case 3:
				System.out.println("남옥 입니다.");
				break;
			case 4:
				System.out.println("다이아몬드 입니다.");
				break;
			case 5:
				System.out.println("비취 입니다.");
				break;
			case 6:
				System.out.println("진주 입니다.");
				break;
			case 7:
				System.out.println("홍옥 입니다.");
				break;
			case 8:
				System.out.println("감람석 입니다.");
				break;
			case 9:
				System.out.println("청옥 입니다.");
				break;
			case 10:
				System.out.println("오팔 입니다.");
				break;
			case 11:
				System.out.println("황옥 입니다.");
				break;
			default:
				System.out.println("터키석 입니다.");
				break;	
		}
	}
}