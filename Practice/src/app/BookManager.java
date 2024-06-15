package app;

import java.util.ArrayList;
import java.util.Iterator;

public class BookManager {
	
	public BookInfo BookInfo;
	
	public static class BookInfo {
		int id; 
		String title;
		String author;
		int publishedYear;
		
		private ArrayList<BookInfo> bookDB; // DB
		
		// 생성자 
		public BookInfo() {bookDB = new ArrayList<BookInfo>();}
		
		// 생성자 
		public BookInfo(int id, String title, String author, int publishedYear) {
			
			bookDB = new ArrayList<BookInfo>();
			BookInfo info = new BookInfo();
			
			info.id = id;
			info.title = title;
			info.author = author;
			info.publishedYear = publishedYear;
			
			bookDB.add(info);
			
		}

		public int testAddBook(int id, String title, String author, int publishedYear) {
			
			Iterator<BookInfo> it = bookDB.iterator();
			
			while (it.hasNext())
			{
				BookInfo i = it.next();
				if (i.id == id) {
					System.out.println("해당 id : (" + id + ")는 이미 존재합니다. ");
					return (1);
				}
			}
			
			bookDB = new ArrayList<BookInfo>();
			BookInfo info = new BookInfo();
			
			info.id = id;
			info.title = title;
			info.author = author;
			info.publishedYear = publishedYear;
			System.out.println("Book{id : " + id +  ", title : " + title + ", author : " + author + ", published Year : " + publishedYear + "} 도서가 추가되었습니다.");
			
			bookDB.add(info);
			
			return (0);
			
		}
		
		public int testSearchBook(int id, String title, String author, int publishedYear) {

			Iterator<BookInfo> it = bookDB.iterator();
			
			while (it.hasNext())
			{
				BookInfo i = it.next();
				if (i.id == id) {
					System.out.println("검색 결과: ");
					System.out.println("Book{id : " + id +  ", title : " + title + ", author : " + author + ", published Year : " + publishedYear + "}");
					return (0);
				}
			}
			System.out.println("검색된 도서가 없습니다.");
			return (1);
		}
		
		public int testRemoveBook(int id, String title, String author, int publishedYear) {
			
			Iterator<BookInfo> it = bookDB.iterator();
			
			while (it.hasNext())
			{
				BookInfo i = it.next();
				if (i.id == id) {
					it.remove();
					System.out.println("Book{id : " + id +  ", title : " + title + ", author : " + author + ", published Year : " + publishedYear + "} 도서를 삭제했습니다. ");
					return (0);
				}
			}
			
			System.out.println("검색된 도서가 없습니다.");
			return (1);

		}
	}

	public static void main(String[] args)
	{
		BookInfo new_book = new BookInfo();
		System.out.println("testing!!11");
		new_book.testAddBook(1, "자바 기초", "Jane", 2021);
		System.out.println("testing!!22");
	}

}
