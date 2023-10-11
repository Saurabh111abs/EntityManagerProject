package com.without.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.without.dao.NativeDao;
@Service
public class NativeService {
	@Autowired
	private NativeDao nativeDao;
	
    public List<Object[]> getResult(){
    	
    	return nativeDao.fetchDataFromDatabase();
		
		
	}

}
