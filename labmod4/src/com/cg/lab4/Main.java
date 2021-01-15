package com.cg.lab4;

public class Main {
	public static void main(String[] args) {
		WrittenItems items=new WrittenItems();
		System.out.println(items.getId());
		System.out.println(items.getTitle());
		Book book=new Book();
		String str=book.getTitle();
		System.out.println(str);
		}
}