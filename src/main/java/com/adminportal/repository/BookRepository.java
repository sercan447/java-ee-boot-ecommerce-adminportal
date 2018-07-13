package com.adminportal.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adminportal.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long>{

	
	@Query("SELECT d FROM Book d WHERE d.id = :id")
	Book findOne(@Param("id")Long id);
	
}
