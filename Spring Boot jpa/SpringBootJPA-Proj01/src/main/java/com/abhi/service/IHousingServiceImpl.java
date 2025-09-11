package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Housing;
import com.abhi.repositry.IHousingRepo;
@Service
public class IHousingServiceImpl implements IHousingService {
	@Autowired
	private IHousingRepo hr;
	@Override
	public String addHouseDetails(Housing hs) {
		System.err.println("IHousingServiceImpl.addHouseDetails()::"+hs.getId());
		Housing hos = hr.save(hs);
		return "House Details saved and id is:: "+hos.getId();
	}

}
