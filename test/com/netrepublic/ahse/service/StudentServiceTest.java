package com.netrepublic.ahse.service;

import java.util.Date;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netrepublic.ahse.domain.Student;
import com.netrepublic.ahse.service.ServiceDao;
import com.netrepublic.ahse.service.StudentService;


public class StudentServiceTest extends TestCase {
	private ApplicationContext ctx = null;
	private Student student = null;
	private ServiceDao dao = null;
	
	public StudentServiceTest() {
        ctx = new ClassPathXmlApplicationContext("classpath:com/netrepublic/ahse/service/services-config.xml");
    }

    protected void setUp() throws Exception {
        super.setUp();
        dao = (StudentService) ctx.getBean("studentService");
    }
    
    protected void tearDown() throws Exception {
    	super.tearDown();
    	dao = null;
    }
    
    public void testSave() throws Exception {
        student = new Student();
        student.setFirstName("Neil");
        student.setMiddleName("Rivera");
        student.setLastName("Juan");
        student.setNickName("Neil");
        student.setGender("m");
        student.setBirthday(new Date(458064000000L));
        student.setBirthPlace("Malolos, Bulacan");
        student.setGuardian("Myself");
        student.setGuardianContactNo("+63 905 340 7276");
        student.setStreet("1221 Anacleto St.");
        student.setCity("Sta. Cruz");
        student.setDistrict("");
        student.setProvince("Metro Manila");
        student.setZip(1018);
        student.setEmail("blitzmoiko@yahoo.com");
        student.setTelNo("888-8888");
        student.setCelNo("+63 905 340 7276");
        student.setSchool("Mabuhay");
        student.setYear(2001);
        student.setMath(96F);
        student.setScience(85F);
        student.setEnglish(86F);
        student.setAverage(89F);
        dao.save(student);
        Assert.assertNotNull("primary key assigned", student.getId());
    }
    
}
