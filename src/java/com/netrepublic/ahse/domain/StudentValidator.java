package com.netrepublic.ahse.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {
	
	public boolean supports(Class clazz) {
		return Student.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
		Student student = (Student) obj;
		
		if (student.getFirstName().trim().equals("")) {
			errors.rejectValue("firstName", "error.emptyFirstName" );
		}
		if (student.getMiddleName().trim().equals("")) {
			errors.rejectValue("middleName", "error.emptyMiddleName");
		}
		if (student.getLastName().trim().equals("")) {
			errors.rejectValue("lastName", "error.emptyLastName");
		}
		if (student.getGender().equals("-")) {
			errors.rejectValue("gender", "error.emptyGender");
		}		
		if (student.getBirthday() == null) {
			errors.rejectValue("birthday", "error.emptyBirthday");
		}		
		
		// Birthday validator
//		if (StringUtils.hasText(student.getBirthday().toString())) {
//			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//			sdf.setLenient(false);
//			try {
//				sdf.parse(student.getBirthday().toString());
//			} catch (NullPointerException e) {
//				errors.rejectValue("birthday", null, "Birthday is required");
//			} catch (IllegalArgumentException e) {
//				errors.rejectValue("birthday", null, "Birthday must be a date value");
//			} catch (ParseException e) {
//				errors.rejectValue("birthday", null, "Birthday is invalid format");
//			} 
//		} 
			
		if (student.getStreet().trim().equals("")) {
			errors.rejectValue("street", "error.emptyStreet");
		}
		if (student.getCity().trim().equals("")) {
			errors.rejectValue("city", "error.emptyCity");
		}
		if (student.getProvince().trim().equals("")) {
			errors.rejectValue("province", "error.emptyProvince");
		}
		if (student.getSchool().trim().equals("")) {
			errors.rejectValue("school", "error.emptySchool");
		}
		if (student.getYear() == null) {
			errors.rejectValue("year", "error.emptyYear");
		}		
		if (student.getMath() == null) {
			errors.rejectValue("math", "error.emptyMath");
		}		
		if (student.getScience() == null) {
			errors.rejectValue("science", "error.emptyScience");
		}		
		if (student.getEnglish() == null) {
			errors.rejectValue("english", null, "error.emptyEnglish");
		}		
		if (student.getAverage() == null) {
			errors.rejectValue("average", null, "error.emptyAverage");
		}		

	}
	
}




