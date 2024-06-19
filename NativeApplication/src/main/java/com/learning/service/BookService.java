package com.learning.service;

import java.util.List;

import com.learning.dto.BooksDto;
import com.learning.entity.BookEntity;

public interface BookService {
	public List<BooksDto> getAllBooks();
	public BooksDto getBookById(Integer bookId);
	public BooksDto createBook(BooksDto booksDto);
	public void deleteBookById(Integer bookId);
	BooksDto updateBook(Integer bookId, BooksDto booksDto);
	public List<String> getBookByName(String bookName);
	
	public BooksDto getDistinctbookNameAndbookGenres(String bookName,String bookGenres);
}
