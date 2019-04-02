package com.practice;

public class WordOccurence {
	
	public static void main(String[] args) {
		
		String str = "hai hello hello java hello";
		String[] array = str.split("");
		System.out.println("no of words in a string are :" + array.length);
		
		String search = "hello";
		System.out.println("leanth of actual str is :"+ str.length());
		System.out.println("leanth of actual search is :"+ search.length());
		String lenthAfterReplace = str.replaceAll("hello", "");
		int wordcount= (str.length()-lenthAfterReplace)/search.length();

		
	}

}
