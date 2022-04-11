package sec3;

import java.util.regex.Pattern;

public class PatternEx1 {
	public static void main(String[] args) {
		//boolean 결과변수 = Pattern.
		
		//정규표현식(Regular Expression)=패턴(Pattern)
		//입력된 데이터가 원하는 형식이 맞는지 검증하게 하는 식
		//아이디, 비밀번호, 전화번호, 이메일, 주민번호 향식 등을 검증
		//한 개의 문자 [] -> [abc] : abc 중 하나의 문자를 포함하고 있는지
		//				[^abc] : 한 문자라도 a, b, c가 아니도록 제한
		//				[a-z] : a~z 영문 소문자가 포함되는지
		//				[a-zA-Z] : 영문 대문자나 소문자가 포함되어 있는지
		//				[a-zA-Z0-9] : 영문, 숫자가 포함되어 있는지
		//\d	-> 십진수 [0-9]를 말함
		//\s	-> 공백이 포함되어 있는지
		//\w	-> [a-zA-Z0-9]와 동일
		//?		-> 없음 또는 하나		kbs? -> kbs 또는 kbs1, kbsa
		//*		-> 없음 또는 한 개 이상	kbs* -> kbs 또는 kbs1234, kbs1
		//+		-> 한 개 이상			kbs+ -> kbs1, kbsa, kbs1234
		//{n}	-> \d{3}	: 숫자 3글자이어야함
		//{n,m} -> \d(3,4} 	: 숫자 3글자 또는 4글자이어야함
		//02, 031, 032 -> \d{2,3}
		//()	-> 그룹 (02|031)
		//|		-> 또는
		
		//(02|031|010)-\d{3,4}-\d{4}	: 전화번호 형식 검증식
		//\w+@\w+(\.\w+)?	: 이메일 주소 검증식
		//\w{8,12} : 아이디 또는 비밀번호 영문 또는 숫자로 8글자 이상 12글자 이하
		//\d{6}-\d{7} : 주민번호 형식 검증식
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String[] data = {"010-1248-1234","032-1278-4321","031-123-432"};
		for(String iso : data) {
			boolean res = Pattern.matches(regExp, iso);
			if(res) {
				System.out.println(iso+"는 정규표현식과 형식이 일치합니다.");
			} else {
				System.out.println(iso+"는 정규표현식과 형식이 불일치합니다.");
			}
		}
		System.out.println("************************************************");
		String regExp2 = "\\w+@\\w+(\\.\\w+)?"; // 문자열 안에서 \을 표현하려면 \\두번붙여야하는데 알아서 붙여짐
		String[] emails = {"kbs@naver.com", "1234&daum.net", "mbc@jjjj"};
		for(String email : emails) {
			boolean res = Pattern.matches(regExp2, email);
			if(res) { 
				System.out.println(email+"은 패턴의 형식과 일치합니다.");
			} else {
				System.out.println(email+"은 패턴의 형식과 불일치합니다.");
			}
		}
		System.out.println("**************************************************");
		String regExp3 = "\\d{6}-\\d{7}";
		String[] jumins = {"930221-1233611", "9330221-1233611", "930221-5233611"};
		for(String jumin : jumins) {
			boolean res = Pattern.matches(regExp3, jumin);
			if(res) {
				System.out.println(jumin+"은 패턴의 형식과 일치합니다.");
			} else {
				System.out.println(jumin+"은 패턴의 형식과 불일치합니다.");
			}
		}
	}
}