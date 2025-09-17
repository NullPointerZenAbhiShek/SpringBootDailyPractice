package com.in.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.entity.Housing;
import com.in.repositry.IHousingRepo;
//@Service marks this class as a service bean for Spring’s component scanning
@Service
public class IHousingServiceImpl implements IHousingService {
	//Dependency Injection for the Repository Design pattern followed
	@Autowired
	private IHousingRepo repository;

	@Override
	public List<Housing> searchHouseByHousePriceRange(Double start, Double end) {
		if(start == null || end == null) {
			return Collections.emptyList();
		}
		return repository.searchHouseByHousePriceRange(start, end);
	}

	@Override
	public List<Housing> searchAllHousesByCities(List<String> cities) {
		if (cities == null || cities.isEmpty()) {
		    return Collections.emptyList();
		}
		return repository.searchAllHousesByCities(cities);
	}

	@Override
	public List<Object[]> searchAllHousesDataByCity(List<String> cities) {
		if (cities == null || cities.isEmpty()) {
		    return Collections.emptyList();
		}
		return repository.searchAllHousesDataByCity(cities);
	}

	@Override
	public List<String> searchAllHousesStateNameByCity(List<String> cities) {
		if (cities == null || cities.isEmpty()) {
		    return Collections.emptyList();
		}
	        return repository.searchAllHousesStateNameByCity(cities);
	}
	
		
}
