package com.example.registrationlogindemo.service;

import java.util.List;

import com.example.registrationlogindemo.entity.ApplicationAdminMstEntity;

public interface WelcomeService {
	
	public List<ApplicationAdminMstEntity> findApplicationAll();
	
	public List<ApplicationAdminMstEntity> findApplicationOnebyId(int applicationCode);
	
	public String idleTerminateConnectivity();

}
