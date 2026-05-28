package Assignments_21_05_2026;

public class Book {
	
	String title;
	String author;
	double price;
	
	public void displayBook() {
		System.out.println("Book title : " + title);
		System.out.println("Book author : " + author);
		System.out.println("Book price : " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.title = "Kids stories";
		book1.author = "Shyam Das";
		book1.price = 101.50;
		
		book1.displayBook();

	}

}
