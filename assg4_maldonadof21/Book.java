package assg4_maldonadof21;

public class Book {

		private String bookId;	
		private String title;
		private String isbn;
		private String author;
		private char category;
		
		public Book(String bookId, String title, String isbn, String author, char category) {
			this.bookId = bookId;
			this.title = title;
			this.isbn = isbn;
			this.author = author;
			this.category = category;
		}
		
		/**
		 * @return
		 */
		public String getbookId(){
			return bookId;
		}
		
		/**
		 * @return
		 */
		public String gettitle() {
			return title;
		}
		
		/**
		 * @return
		 */
		public String getisbn() {
			return isbn;
		}
		
		/**
		 * @return
		 */
		public String getauthor() {
			return author;
		}
		
		/**
		 * @return
		 */
		public char getcategory() {
			return category;
		}
		
		public String toString() {
			return "Book ID: " + bookId + "\tTitle: " + title + "\tISBN: " + isbn + "\tAuthor: " + author + "\tCategory: " + category;
		}
		
		/**
		 * 
		 * @param array
		 * @param numofBooks
		 * @param bookId
		 * @return
		 * @throws BookNotFoundException
		 */
		public static int bookSearch(Book[] array, int numofBooks, String bookId) throws BookNotFoundException{
			
			for(int i = 0; i < numofBooks; i++) {
				if(array[i].getbookId().equals(bookId))
					return i;
			}
			
			throw new BookNotFoundException();
				
		
		
		
			}
		


}
