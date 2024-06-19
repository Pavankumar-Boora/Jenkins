package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
	
	public List<BookEntity> findAll();
	@Query("select  e.bookName, e.bookId from book e where e.bookName=:bookName" )
	public List<String> findBybookName(@Param("bookName") String bookName);
	public BookEntity findDistinctByBookNameAndBookGenres(String bookName,String bookGenres);
	
}
	
