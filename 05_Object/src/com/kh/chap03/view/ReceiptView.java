package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

//화면 담당(입/출력)
public class ReceiptView {

	public void mainMenu() {
		// System.out.println("핫하~~");
		
		// 사용자에게 영수증 정보를 입력받고
		// 입력받은 영수증 정보를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// Receipt 라는 클래스를 가지고 객체 생성
		Receipt r = new Receipt();
					// 객체(object)	==> 추상적인 개념
					// Instance 	==> 실제 메모리에 올라간 데이터
		// 1. 참조자료형
		
		//클래스를 만든다는 행위 == 개발자가 자신에게 필요한 사용자 정의 자료형을 만들겠다
		
		// 2. 여러 자료형에 각각 여러개의 값을 보관가능 + 기능
		
		
		
		
		
		sc.close();//닫으면 다시 스캐너 메소드 못씀?
	}
	
}
