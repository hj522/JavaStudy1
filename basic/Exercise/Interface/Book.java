package Exercise.Interface;

public abstract class Book {

	// 필드
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 1;
	
	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks++;
	}
			 
	
	// 메소드
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Book book = null;
		if (obj instanceof Book) {
			book = (Book) obj;
		}
		if (this.author.equals(book.author)
				&& this.title.equals(book.title)) {
			return true;
		} else {
			return true;
	}
}
	// return this.author.equals(book.author) && this.title.equals(book.title) 한줄로 가능

//	hashCode() {
//	}
	
	
	public abstract int getLateFee(int lateDays);
	
	
	public String toString() {
		return "제목: " + title + ", 작가: " + author +  ;
	}
}
