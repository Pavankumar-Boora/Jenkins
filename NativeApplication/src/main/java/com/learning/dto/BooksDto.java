package com.learning.dto;

import com.learning.entity.BookEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BooksDto {
	
	private Integer bookId;
	private String bookName;
	private String bookGenres;
	private Double bookPrice;
	
	public BooksDto(BookEntity bookEntity) {
		super();
		this.bookId = bookEntity.getBookId();
		this.bookName = bookEntity.getBookName();
		this.bookGenres = bookEntity.getBookGenres();
		this.bookPrice = bookEntity.getBookPrice();
	}
	
	
	
}
