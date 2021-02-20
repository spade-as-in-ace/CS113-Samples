public class Bookshelf {

	public static void main(String[] args) {
		Book[] listOfBooks = new Book[5];
		
		listOfBooks[0] = new Book("Book1", "a1", "Penguin", "20/2/21");
		listOfBooks[1] = new Book("Book2", "b2", "Osprey", "20/2/98");
		listOfBooks[2] = new Book("Book3", "c3", "Publisher3", "10/10/00");
		listOfBooks[3] = new Book("Book4", "d4", "FakePublisher", "3/2/01");
		listOfBooks[4] = new Book("Book5", "e5", "EA", "6/1/82");
		
		
		/*
		 * for book in listOfBooks:
		 * 		print(book)
		 */
		
		for(Book book : listOfBooks) {
			System.out.println(book);
		}
		
		System.out.println("Updating books");
		
		listOfBooks[3].setTitle("Book 4 SECOND EDITION");
		listOfBooks[2].setAuthor("New Author");
		listOfBooks[0].setCopyright("21/2/21");
		listOfBooks[4].setPublisher("Not EA");
		
		for(Book book : listOfBooks) {
			System.out.println(book);
		}

	}

}
