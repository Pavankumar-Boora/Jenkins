package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dto.BooksDto;
import com.learning.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/createBook")
	public ResponseEntity<BooksDto> createBook(@RequestBody BooksDto booksDto){
		return ResponseEntity.ok(bookService.createBook(booksDto));
	}
	
	@PutMapping("/updateBook/{bookId}")
	public ResponseEntity<BooksDto> updateBook(@PathVariable Integer bookId,@RequestBody BooksDto booksDto){
		return ResponseEntity.ok(bookService.updateBook(bookId,booksDto));
	}
	
	@GetMapping("/getBook/{bookId}")
	public ResponseEntity<BooksDto> getBook(@PathVariable Integer bookId){
		return ResponseEntity.ok(bookService.getBookById(bookId));
	}
	@GetMapping("/")
	public ResponseEntity<List<BooksDto>> getAllBook(){
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	@DeleteMapping("/deleteBook/{bookId}")
	public ResponseEntity<String> deleteBookById(@PathVariable Integer bookId) {
		bookService.deleteBookById(bookId);
		return ResponseEntity.ok("Record hasbeen Deleted");
	}
	@GetMapping("/getBookbyName/{bookName}")
	public ResponseEntity<List<String>> getBook(@PathVariable String bookName){
		return ResponseEntity.ok(bookService.getBookByName(bookName));
	}
	@GetMapping("/getDistinctBookNameAndBookGenres")
	public ResponseEntity<BooksDto> getDistinctbookName(@RequestParam("bookName") String bookName,@RequestParam("bookGenres") String bookGenres){
		return ResponseEntity.ok(bookService.getDistinctbookNameAndbookGenres(bookName,bookGenres));
	}
	
}
