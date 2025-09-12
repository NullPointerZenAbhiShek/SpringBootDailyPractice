package com.as.service;



import org.springframework.data.domain.Page;

import com.as.entity.Housing;


public interface IHousingService {
	public String addHouseDetails(Housing hs);
	public String addHOusesDetails(Iterable<Housing> hrList);
	public Iterable<Housing> showHousesByShorted(boolean asc,String ...props);
	public Page<Housing> showHousesInfoByPageNo(int pageNo,int pageSize,boolean asc,String ...props);
}
