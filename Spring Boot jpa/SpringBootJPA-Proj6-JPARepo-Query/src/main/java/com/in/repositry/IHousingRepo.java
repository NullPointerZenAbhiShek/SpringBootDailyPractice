package com.in.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.in.entity.Housing;

public interface IHousingRepo extends JpaRepository<Housing, Long> {
	/*using @query with hql or jpql 
	 * 
	 * we can use positional params like this ?1 and these should be start with 1 and end with the following
	 * numbers of params used in the method\
	 * 
	 * we can also use direct same name with (:name) as given in the method params instade of 
	 * using @Param("name")
	 * */
	@Query("FROM Housing WHERE price>=:startRange AND price<=:endRange")
	public List<Housing> searchHouseByHousePriceRange
	(@Param("startRange") Double start,@Param("endRange")Double end);
	
	/*using entity hibernate query language for the bulk select operation
	 * it will return entity type like in here List<Housing> as example 
	 * from house where (:cities is null or city in :cities)
	 * */
	@Query("FROM Housing h WHERE h.city IN(:cities)")
	public List<Housing> searchAllHousesByCities(List<String> cities);
	
	/*using scalar projection query 
	 * it will return List<Object[]>
	 * specific for mulitple col values
	 * */
	@Query("SELECT h.state, h.address,h.city,h.price FROM Housing h WHERE h.city IN(:cities)")
	public List<Object[]> searchAllHousesDataByCity(List<String> cities);
	
	/*using scalar projection query 
	 * it will return List<String>
	 * specific for single col value
	 * */
	@Query("SELECT h.state FROM Housing h WHERE h.city IN(:cities)")
	public List<String> searchAllHousesStateNameByCity(List<String> cities);
	
}
