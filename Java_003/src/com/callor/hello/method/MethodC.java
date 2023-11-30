package com.callor.hello.method;

public class MethodC {
	
	public static String nation() {
		return "민국";
		 
	}
	
	public static void main(String[] args) {
		String kor = "대한" + nation();  
		
		System.out.println(kor);
		
	}

}
