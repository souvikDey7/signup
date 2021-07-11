package com.cts.mfpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.cts.mfpe.dao.SignDao;
import com.cts.mfpe.model.userData;

@Service
public class signServiceImpls implements SignService {

	@Autowired
	SignDao signDao;
	
	@Override
	public List<userData> findByName(userData userdata)
	{
		return signDao.findByName(userdata.getName());
	}
	@Override
	public boolean save(userData userdata) {
		if(this.findByName(userdata).size()==0)
			signDao.save(userdata);
		else
			return false;
		return true;
	}
}
