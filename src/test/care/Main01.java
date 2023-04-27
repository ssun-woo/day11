package test.care;
// package 명명규칙 : https://codedragon.tistory.com/228

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
// 이렇게 전부 사용하는거보단
import java.util.*;
// 이렇게 util내부에 있는 모든 것들을 불러온다

//import test.java.TestClass01;
//import test.java.TestClass02;
//import test.java.TestClass03;
//여기도 마찬가지로
import test.java.*;
//이렇게 한번에 불러올 수 있다

import test.date.Date;

// class AAA{}
// 하나의 Class에서 여러개를 만들어 쓰는 일은 드물다



public class Main01 {
	public static void main(String[] args) {
		
		Test01 t = new Test01();
		t.test();
		t.num = 111;
		
		TestClass01 t01 = new TestClass01();
		t01.test();
		// 서로 다른 패키지에 있다면 import해서 사용해야 한다
		// ctrl + space바  or  ctrl + shift + o 로 import 가능
		// ArrayList, Scanner, HashMap ... 같은 것들도 마찬가지, 존재하는 곳의 위치를 알려줌
		
		TestClass02 t02 = new TestClass02();
		TestClass03 t03 = new TestClass03();
		
		Date dd = new Date();
		dd.data();
		
		test.java.Date d01 = new test.java.Date();
		d01.data();
		
		java.util.Date d02 = new java.util.Date();
		System.out.println(d02);
		
		// 이름이 같은 클래스를 가져다 쓰다보면 위처럼 나올 수 있다
		// import가 아닌 .을 통해 위치를 알려준다
		
	}
}
