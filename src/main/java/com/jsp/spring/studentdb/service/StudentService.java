package com.jsp.spring.studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.studentdb.entity.Student;
import com.jsp.spring.studentdb.repositary.StudentRepositary;

@Service
public class StudentService {

	@Autowired
	private StudentRepositary studentRepositary;

	public ModelAndView addStudent(Student student) {
		//processing request saving student 
		studentRepositary.addStudent(student);
		//response return back to dashboard
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");

		return mav;
	}

	public ModelAndView findAllStudents(Student student) {
		//processing request
		List<Student> students= studentRepositary.findStudents();

		//response sent to the display page
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayAll.jsp");
		mav.addObject("studentList", students);

		return mav;
	}

	public ModelAndView findById(int studentId) {
		Student stu=studentRepositary.findById(studentId);

		ModelAndView mav=new ModelAndView();
		mav.setViewName("updateStudent.jsp");
		mav.addObject("studentObject", stu);
		return mav;
	}

	public ModelAndView updateStudent(Student st) {
		studentRepositary.updateStudent(st);

//		List<Student> students= studentRepositary.findStudents();//this is also fine to reduce code we have some other tips
//
//		//response sent to the display page
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("displayAll.jsp");
//		mav.addObject("studentList", students);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:display-students-details");
		

		return mav;
	}

	public ModelAndView deleteStudent(int studentId) {
		studentRepositary.deleteStudent(studentId);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:display-students-details");
		return mav;
	}
}
