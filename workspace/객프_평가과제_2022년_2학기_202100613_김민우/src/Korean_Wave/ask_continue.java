package Korean_Wave;

import java.util.*;

//주석 2: 상속할 클래스 생성, 각 번호에 대한 설명이 종료된 후 계속 여부를 묻기 위한 클래스입니다.

public class ask_continue {
	static void breakorcontinue() {
		System.out.println("계속 하시겠습니까?(Y/N)");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String go = sc.next();
			if(go.equals("N")) {System.exit(0); }
			else if (go.equals("Y")) {break; }
			else {System.out.println("다시 입력해주세요."); }
		}
		
	}
}
