package com.Space.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Space.dao.CollectionDao;
import com.Space.model.Collection;

@Service
public class CollectionService {

	@Autowired
	CollectionDao ccd ;
	
	public List<Collection> css () {
		ccd.cd();
		return ccd.cd();
	}
}
