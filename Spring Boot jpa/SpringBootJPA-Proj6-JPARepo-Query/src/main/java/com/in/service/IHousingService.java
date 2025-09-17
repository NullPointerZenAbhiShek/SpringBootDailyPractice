package com.in.service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.in.entity.Housing;


public interface IHousingService  {
	@Query("FROM Housing WHERE price>=:startRange AND price<=:endRange")
	public List<Housing> searchHouseByHousePriceRange
	(@Param("startRange") Double start,@Param("endRange")Double end);
	
	@Query("FROM Housing h WHERE h.city IN(:cities)")
	public List<Housing> searchAllHousesByCities(List<String> cities);
	
	@Query("SELECT h.state, h.address,h.city,h.price FROM Housing h WHERE h.city IN(:cities)")
	public List<Object[]> searchAllHousesDataByCity(List<String> cities);
	
	@Query("SELECT h.state FROM Housing h WHERE h.city IN(:cities)")
	public List<String> searchAllHousesStateNameByCity(List<String> cities);
}
