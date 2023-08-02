package com.example.registrationlogindemo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="APPLICATION_ADMIN_MST",schema="public")
public class ApplicationAdminMstEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="APPLICATION_ID")
	private Integer applicationId;
	
	
	@Column(name="APPLICATION_CODE")
	private Integer applicationCode;
	
	@Column(name="APPLICATION_NAME_EN")
	private String applicationNameEn;
	
	@Column(name="APPLICATION_NAME_MR")
	private String applicationNameMr;
	
	@Column(name="DEPARTMENT_NAME_EN")
	private String departmentNameEn;
	@Column(name="DEPARTMENT_NAME_MR")
	private String departmentNameMr;
	@Column(name="NODAL_OFFICER_NAME")
	private String nodalOfficerName;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="ADDRESS_1")
	private String address_1;
	@Column(name="PINCODE")
	private String pincode;
	@Column(name="CONTACT_NO")
	private String contactNo;
	@Column(name="CONTACT_NO_1")
	private String contactNo1;
	
	@Column(name="MOBILE_NO")
	private Integer mobileNo;
	@Column(name="MOBILE_NO_2")
	private Integer mobileNo2;
	@Column(name="EMAIL_ID")
	private String emailId;
		
	@Column(name = "CREATED_USER_ID")
	private Integer createdUserId;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@Column(name = "UPDATED_USER_ID")
	private Integer updatedUserId;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name = "IS_ACTIVE")
	private Character isActive;
	
	 @Column(name = "DESIGNATION")
	 private String designation;
	 
	 @Column(name = "SUPPORT_EMAIL_ID")
	 private String supportEmailId;
	 
	 @Column(name = "TELEPHONE_NO")
	 private String telephoneNo;
	 
	 @Column(name = "WEBSITE_LINK")
	 private String websitelink;
	 
	 

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(Integer applicationCode) {
		this.applicationCode = applicationCode;
	}

	public String getApplicationNameEn() {
		return applicationNameEn;
	}

	public void setApplicationNameEn(String applicationNameEn) {
		this.applicationNameEn = applicationNameEn;
	}

	public String getApplicationNameMr() {
		return applicationNameMr;
	}

	public void setApplicationNameMr(String applicationNameMr) {
		this.applicationNameMr = applicationNameMr;
	}

	public String getDepartmentNameEn() {
		return departmentNameEn;
	}

	public void setDepartmentNameEn(String departmentNameEn) {
		this.departmentNameEn = departmentNameEn;
	}

	public String getDepartmentNameMr() {
		return departmentNameMr;
	}

	public void setDepartmentNameMr(String departmentNameMr) {
		this.departmentNameMr = departmentNameMr;
	}

	public String getNodalOfficerName() {
		return nodalOfficerName;
	}

	public void setNodalOfficerName(String nodalOfficerName) {
		this.nodalOfficerName = nodalOfficerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getContactNo1() {
		return contactNo1;
	}

	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getMobileNo2() {
		return mobileNo2;
	}

	public void setMobileNo2(Integer mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(Integer updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSupportEmailId() {
		return supportEmailId;
	}

	public void setSupportEmailId(String supportEmailId) {
		this.supportEmailId = supportEmailId;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getWebsitelink() {
		return websitelink;
	}

	public void setWebsitelink(String websitelink) {
		this.websitelink = websitelink;
	}
	 
	 

}
