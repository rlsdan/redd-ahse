package com.netrepublic.ahse.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Student entity.
 */

public class Student implements Serializable {

	// Fields

	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String nickName;
	private String gender;
	private Date birthday;
	private String birthPlace;
	private String guardian;
	private String guardianContactNo;
	private String street;
	private String city;
	private String district;
	private String province;
	private Integer zip;
	private String email;
	private String telNo;
	private String celNo;
	private String school;
	private Integer year;
	private Float math;
	private Float science;
	private Float english;
	private Float average;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String firstName, String middleName, String lastName,
			String nickName, String gender, Date birthday, String birthPlace,
			String guardian, String guardianContactNo, String street,
			String city, String district, String province, Integer zip,
			String email, String telNo, String celNo, String school,
			Integer year, Float math, Float science, Float english,
			Float average) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.gender = gender;
		this.birthday = birthday;
		this.birthPlace = birthPlace;
		this.guardian = guardian;
		this.guardianContactNo = guardianContactNo;
		this.street = street;
		this.city = city;
		this.district = district;
		this.province = province;
		this.zip = zip;
		this.email = email;
		this.telNo = telNo;
		this.celNo = celNo;
		this.school = school;
		this.year = year;
		this.math = math;
		this.science = science;
		this.english = english;
		this.average = average;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getGuardian() {
		return this.guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}

	public String getGuardianContactNo() {
		return this.guardianContactNo;
	}

	public void setGuardianContactNo(String guardianContactNo) {
		this.guardianContactNo = guardianContactNo;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getCelNo() {
		return this.celNo;
	}

	public void setCelNo(String celNo) {
		this.celNo = celNo;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Float getMath() {
		return this.math;
	}

	public void setMath(Float math) {
		this.math = math;
	}

	public Float getScience() {
		return this.science;
	}

	public void setScience(Float science) {
		this.science = science;
	}

	public Float getEnglish() {
		return this.english;
	}

	public void setEnglish(Float english) {
		this.english = english;
	}

	public Float getAverage() {
		return this.average;
	}

	public void setAverage(Float average) {
		this.average = average;
	}

	public String toString() {
		return getFirstName() + " " + getMiddleName() + " " + getLastName();
	}

}