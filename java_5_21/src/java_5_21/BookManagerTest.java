package java_5_21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java_5_21.BookManager.BookInfo;

import static org.junit.jupiter.api.Assertions.*;

class BookMana gerTest {
	
	private BookInfo bookDB;

	
	@BeforeEach
	void setUp() {
		
		BookInfo bookDB = new BookManager().BookInfo;
		System.out.println("새 bookUnit 인스턴스 생성 ");
		
	}

	@Test
	void testAddBook() {
		assertEquals(1, bookDB.testSearchBook(1, "자바 기초", "Jane", 2020), "hi");      
		System.out.println("11 ");
		assertEquals(0, bookDB.testAddBook(1, "자바 기초", "Jane", 2021), "aa");
		System.out.println("22");
		assertEquals(0, bookDB.testAddBook(2, "소프트웨어 공학", "Tom", 2014), "ss");
		System.out.println("33");
//		assertEquals(0 ,bookDB.testSearchBook(1, "자바 기초", "Jane", 2021), "dd");
//		asserEqulas("해당 ID(1)의 도서를 찾을 수 없습니다.", bookDB.testSearchBook(1, "자바 기초", "Jane", 2021));
//		asserEqulas(1, bookDB.testSearchBook(1, "자바 기초", "Jane", 2021));
	   
	}
	

   @Test
   void testTestSearchBook() {
    
   }

   @Test
   void testTestRemoveBook() {
    
   }

}
