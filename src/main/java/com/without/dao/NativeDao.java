package com.without.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.without.consumer.Consumer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class NativeDao {
	
	@Autowired
	private EntityManager entityManager;
	
	 public List<Object[]> fetchDataFromDatabase() {
	        String nativeQuery = "select tea_name , emp_name , ply_sport from teacher , emp , player";

	        Query query = entityManager.createNativeQuery(nativeQuery);

	        // Execute the query and retrieve the results
	        @SuppressWarnings("unchecked")
	        List<Object[]> results = query.getResultList();
	        
	        for (Object[] result : results) {
	            // Access individual columns using result[index]
	        	Consumer consumer = new Consumer();
	        	consumer.setEmp_Name(result[1].toString());
	        	consumer.setTea_Name(result[0].toString());
	        	consumer.setPly_sport(result[2].toString());
	        	
	        	System.out.println("consumer :" +consumer);
	        	String eName=consumer.getEmp_Name().toString();
	        	System.out.println(eName);
	        	String tName= consumer.getTea_Name().toString();
	        	System.out.println(tName);
	        	String pSport = consumer.getPly_sport().toString();
	        	System.out.println(pSport);
	        	
	        	
	            System.out.println("Column 1: " + result[0] + ", Column 2: " + result[1] + ", Column 3: " + result[2]);
	        }

	        return results;
	    }

}
