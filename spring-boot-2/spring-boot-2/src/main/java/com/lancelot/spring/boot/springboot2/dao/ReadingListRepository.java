package com.lancelot.spring.boot.springboot2.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lancelot.spring.boot.springboot2.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByReader(String reader);

}
