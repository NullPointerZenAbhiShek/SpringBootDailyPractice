package com.as.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.as.entity.Housing;
import com.as.service.IHousingService;

@Controller
public class HousingManagementController {
	@Autowired
	private IHousingService hrService;
	
	public String addHouseDetails(Housing hs) {
		return hrService.addHouseDetails(hs);
	}
	public String addHOusesDetails(Iterable<Housing> hrList) {
		return hrService.addHOusesDetails(hrList);
	}
	
	public Iterable<Housing> showHousesByShorted(boolean asc, String... props) {
		return hrService.showHousesByShorted(asc, props);
	}
	public Page<Housing> showHousesInfoByPageNo(int pageNo, int pageSize, boolean asc, String... props){
		return hrService.showHousesInfoByPageNo(pageNo, pageSize, asc, props);
	}
}
