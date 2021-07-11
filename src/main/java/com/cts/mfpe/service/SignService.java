package com.cts.mfpe.service;

import java.util.List;

import com.cts.mfpe.model.userData;

public interface SignService {
	public boolean save(userData userdata);
	public List<userData> findByName(userData userdata);
	//public boolean findByPassword(userData userdata);
}
