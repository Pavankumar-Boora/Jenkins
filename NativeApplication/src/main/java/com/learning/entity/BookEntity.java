package com.learning.entity;

import com.learning.dto.BooksDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "book")
@Table(name = "jjn")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String bookGenres;
	private Double bookPrice;
	
	public BookEntity(BooksDto bookDto) {
		super();
		this.bookId = bookDto.getBookId();
		this.bookName = bookDto.getBookName();
		this.bookGenres = bookDto.getBookGenres();
		this.bookPrice = bookDto.getBookPrice();
	}
}
