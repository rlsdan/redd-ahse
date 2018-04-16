package com.netrepublic.ahse.service;

import com.netrepublic.ahse.domain.Student;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

public class StudentService implements ServiceDao {
	private SessionFactory sessionFactory = null;	
	
	static Logger log = Logger.getLogger(StudentService.class);
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public Object get(Long id) {
		Session session = SessionFactoryUtils.getSession(getSessionFactory(), false);
		try {
			return (Student) session.get(Student.class, id);			
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}
	}

	public List<Student> getAll() {
		Session session = SessionFactoryUtils.getSession(getSessionFactory(), false);
		try {
			return session.createQuery("from Student").list();
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}
	}

	public void save(Object object) {
		Session session = SessionFactoryUtils.getSession(getSessionFactory(), false);
		try {
			session.saveOrUpdate((Student) object);
			session.flush();
			log.debug(object);
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}
	}

	public void remove(Object object) {
		Session session = SessionFactoryUtils.getSession(getSessionFactory(), false);
		try {
			session.delete((Student) object);
			session.flush();
			log.debug(object);
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}
	}

	public List findByFirstName(String firstName) {
		Session session = SessionFactoryUtils.getSession(getSessionFactory(), false);
		try {
			return session.getNamedQuery("from Student where firstName = " + firstName).list();
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}
	}
	
	public List findByLastName(String lastName) {
		Session session = SessionFactoryUtils.getSession(getSessionFactory(), false);
		try {
			return session.getNamedQuery("from Student where lastName = " + lastName).list();
		} catch (HibernateException e) {
			throw SessionFactoryUtils.convertHibernateAccessException(e);
		}
	}
}