package com.abhi.repositry;

import org.springframework.data.repository.CrudRepository;

import com.abhi.entity.Housing;

public interface IHousingRepo extends CrudRepository<Housing, Long> {

}
