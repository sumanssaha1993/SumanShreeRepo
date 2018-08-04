package com.suman.model.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suman.DTO.StudentDTO;

@Repository
public class StudentDAO {

	@Autowired
	private SessionFactory factory;
	
	public StudentDTO getInfo(String id) {
		StudentDTO dto = null;
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			tx.begin();
			Query query = sess.createQuery("from StudentDTO where std_id=:std_id");
			query.setParameter("std_id", id);
			dto = (StudentDTO) query.uniqueResult();
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return dto;
	}
}
