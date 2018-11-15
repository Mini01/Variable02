package com.biz.variable;

public class VariableType04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char charAlpha = 'A';
		char charNum = '0';
		char charSpec = '%';
		char charSpace = ' ';
		
		System.out.println(charAlpha);
		System.out.println(charNum);
		System.out.println(charSpec);
		System.out.println(charSpace);
		
		int intAlpha= charAlpha;
		int intNum = charNum;
		int intSpec = charSpec;
		int intSpace = charSpace;
		
		//char 문자형 변수값을
		// int 형 변수에 복사하면
		// 해당 문자의 ASCII코드가 복사된다.
		System.out.println("=== int char ===");
		System.out.println(intAlpha);
		System.out.println(intNum);
		System.out.println(intSpec);
		System.out.println(intSpace);
		
		
		System.out.println(charAlpha + charNum);
		System.out.println(charAlpha + charSpec);
		System.out.println(charAlpha + charSpace); 
		
		int intSQ = charAlpha + 20;
		System.out.println(intSQ);
		System.out.println((char)intSQ);
		
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		
		intAlpha = charAlpha;
		System.out.println("=================");
		System.out.println((char)intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		
		
		
		

	}

}
