package com.godcoder.repository;


import com.godcoder.model.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long>{

}
