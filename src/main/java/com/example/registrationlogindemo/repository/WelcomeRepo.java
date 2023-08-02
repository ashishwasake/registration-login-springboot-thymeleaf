package com.example.registrationlogindemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.registrationlogindemo.entity.ApplicationAdminMstEntity;

@Repository
public interface WelcomeRepo extends JpaRepository<ApplicationAdminMstEntity, Integer>{
	
	
	@Query("FROM ApplicationAdminMstEntity ORDER BY applicationId ASC")
	List<ApplicationAdminMstEntity> findAllAsc();
	
	@Query("FROM ApplicationAdminMstEntity as  t where t.applicationCode = :applicationCode")
	List<ApplicationAdminMstEntity>findAllByApplicationCode( @Param("applicationCode") int applicationCode);

}
