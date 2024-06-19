package com.learning.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dto.BooksDto;
import com.learning.entity.BookEntity;
import com.learning.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	@Override
	public List<BooksDto> getAllBooks() {
		return bookRepository.findAll().stream().map(BooksDto::new).collect(Collectors.toList());
	}

	@Override
	public BooksDto getBookById(Integer bookId) {
		Optional<BookEntity> bookDtodDb = bookRepository.findById(bookId);
		return new BooksDto(bookDtodDb.get());
	}

	@Override
	public BooksDto createBook(BooksDto booksDto) {
		return new BooksDto(bookRepository.save(new BookEntity(booksDto)));	 
	}

	@Override
	public BooksDto updateBook(Integer bookId,BooksDto booksDto) {
		if(this.getBookById(bookId)!=null) {
			booksDto.setBookId(bookId);
			return this.createBook(booksDto);
		}
		return null;
	}

	@Override
	public void deleteBookById(Integer bookId) {
		if(this.getBookById(bookId)!=null) {
			this.deleteBookById(bookId);
		}else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public List<String> getBookByName(String bookName) {
		return bookRepository.findBybookName(bookName).stream().map(String::new).collect(Collectors.toList());
	}

	@Override
	public BooksDto getDistinctbookNameAndbookGenres(String bookName,String bookGenres) {  
		return new BooksDto(bookRepository.findDistinctByBookNameAndBookGenres(bookName,bookGenres));
	}

}
