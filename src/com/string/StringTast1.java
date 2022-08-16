package com.string;

public class StringTast1 {
	public static void main(String[] args) {
		
		String d="Entertainment";
		String d1="Entertainment";
		
		System.out.println(System.identityHashCode(d));
		
		System.out.println(System.identityHashCode(d1));
		System.out.println("*************************");
		
		String d2=new String("Kanmani");
		String d3=new String("Katija");
		
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		String concat = d2.concat(d3);
		System.out.println(concat);
		
		System.out.println("*************************");
		
		
		String d4="vikram";
		String d5="Don";
		
		String concat2 = d4.concat(d5);
		System.out.println(concat2);
		System.out.println(System.identityHashCode(d4));
		System.out.println(System.identityHashCode(d5));
		System.out.println(System.identityHashCode(concat2));
		System.out.println("*************************");
		
		
		StringBuilder d6=new StringBuilder("Thala62");
		StringBuilder d7=new StringBuilder("Thalaivar167");
		StringBuilder append = d6.append(d7);
		System.out.println(append);
		System.out.println(System.identityHashCode(d6));
		System.out.println(System.identityHashCode(d7));
		System.out.println(System.identityHashCode(append));
	}
}
