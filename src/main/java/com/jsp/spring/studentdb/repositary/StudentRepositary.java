package com.jsp.spring.studentdb.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring.studentdb.entity.Student;

@Repository
public class StudentRepositary {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql");
	
	public void addStudent(Student student) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(student);
		
		et.commit();
		em.close();
	}

	public List<Student> findStudents() {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query qu= em.createQuery("from Student");
		List<Student> slist= qu.getResultList();
		
		et.commit();
		em.close();
		
		return slist;
	}

	public Student findById(int studentId) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
	    Student st=em.find(Student.class,studentId );	
		
		et.commit();
		em.close();
		return st;
	}

	public void updateStudent(Student st) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
	    em.merge(st);	
		
		et.commit();
		em.close();
		
	}

	public void deleteStudent(int stu) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student student=em.find(Student.class, stu);
	    em.remove(student);	
		
		et.commit();
		em.close();
	}
}
