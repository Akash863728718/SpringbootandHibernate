package com.app.Akash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.Akash.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

	
	
}
