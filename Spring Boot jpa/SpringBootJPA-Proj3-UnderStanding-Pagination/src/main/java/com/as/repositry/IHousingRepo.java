package com.as.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.as.entity.Housing;

public interface IHousingRepo extends CrudRepository<Housing, Long>, PagingAndSortingRepository<Housing, Long> {

}
