package com.test1;

class Book{
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getInfo() {
		return title+"\t"+ author+"\t"+ price;
	}
	
}

public class Ex05_13_1 {

	public static Book createBook() {
		Book b = new Book("데이터베이스", "홍길동", 100);
		return b;
	}
	
	public static void changeBook(Book book) {
		System.out.println("changeBook book ===============" + book);
		book.title = "Java8";
		book.price = 3000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = createBook();	// 데이터베이스, 홍길동, 100 저장
		System.out.println(b1.getInfo());
		Book b2 = createBook();	// 데베, 홍길동, 100
		System.out.println(b2.getInfo());
		// b1과 b1는 같은가
		System.out.println(b1==b2);
		
		Book book = new Book("Java", "인경열", 2000);
		System.out.println(book);
		System.out.println("변경전=========="+book.getInfo());
		changeBook(book);
		System.out.println("변경후=========="+book.getInfo());
				
	}

}
