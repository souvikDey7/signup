package com.cts.mfpe.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.mfpe.model.userData;

@Repository
public interface SignDao extends JpaRepository<userData,Integer>{

	public List<userData> findByName(String name);
}
