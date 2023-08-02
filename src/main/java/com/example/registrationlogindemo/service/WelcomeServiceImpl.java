package com.example.registrationlogindemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.registrationlogindemo.entity.ApplicationAdminMstEntity;
import com.example.registrationlogindemo.repository.TerminateRepo;
import com.example.registrationlogindemo.repository.WelcomeRepo;


@Service
@Transactional
public class WelcomeServiceImpl implements WelcomeService{
	
	@Autowired
	WelcomeRepo welcomeRepo;
	
	@Autowired
	TerminateRepo terminateRepo;

	@Override
	public List<ApplicationAdminMstEntity> findApplicationAll() {
		
		return welcomeRepo.findAllAsc();
	}

	@Override
	public List<ApplicationAdminMstEntity> findApplicationOnebyId(int applicationCode) {
		
		return welcomeRepo.findAllByApplicationCode(applicationCode);
	}

	@Override
	public String idleTerminateConnectivity() {
		
		return terminateRepo.idleTerminateConnectivity();
		
	}
	
	

}
