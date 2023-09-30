package com.app.Akash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.Akash.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	// CASE#1 FETCHING ALL COLUMN DATA
	// @Query("SELECT B FROM com.app.Akash.entity.Book B")
	@Query(" FROM Book B") // short format = package name optional +starts at FROM
	public List<Book> getAllBook();

//	
	@Transactional
	@Modifying
	@Query(nativeQuery = true,value="SELECT bookName,bookCost FROM Book ")
	public List<Object[]> getNameAndCost();

//	
//	
//	//=========================Query with Parameters============
//	
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 */
	  @Query("SELECT B FROM Book B WHERE B.bookName=?1 OR B.bookCost=?2") 
	  public List<Book> getDataA(String bname, Double bCost);
	 
}
