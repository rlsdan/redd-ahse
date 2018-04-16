package com.netrepublic.ahse.web;

import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import com.netrepublic.ahse.domain.Student;
import com.netrepublic.ahse.service.StudentService;

public class StudentEnrollerAction implements Action {
	private Student student;

	private StudentService dao;

	// injected
	public void setDao(StudentService dao) {
		this.dao = dao;
	}

	public Event execute(RequestContext context) throws Exception {
		student = (Student) context.getFlowScope().get("student");
		dao.save(student);
		return new Event(this, "success");
	}
}
