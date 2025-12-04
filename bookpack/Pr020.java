package bookpack;

class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);

		System.out.println();
	}
}
class Pr020 {
	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("Портрет Дориана Грея", "О. Уйалд", 1850);
		books[1] = new Book("Преступление и наказание", "Ф.М. Достоевский", 1971);
		books[2] = new Book("Мастер и Маргарита", "М.А. Булгаков", 1981);
		books[3] = new Book("Оно", "Стивен Кинг", 1981);
		books[4] = new Book("Мартин Иден", "Дж. Лондон", 1927);

		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}
