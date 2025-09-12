package com.as.service;

import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.as.entity.Housing;
import com.as.repositry.IHousingRepo;
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
	@Override
	public String addHOusesDetails(Iterable<Housing> hrList) {
		Iterable<Housing> housList = hr.saveAll(hrList);
		long count = StreamSupport.stream(housList.spliterator(), false).count();
		return "Multiple House Details add:: "+count;
	}
		@Override
		public Iterable<Housing> showHousesByShorted(boolean asc, String... props) {
			// Prepare Sorting
			Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, props);
			//Use Repo
			Iterable<Housing> houses = hr.findAll(sort);
			return houses;
		}	
		@Override
		public Page<Housing> showHousesInfoByPageNo(int pageNo, int pageSize, boolean asc, String... props) {
			// Prepare sorting
			Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, props);
			//Prepare Pageable object
			Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
			
			//use repo
			Page<Housing> page = hr.findAll(pageable);
			
			return page;
		}
}
