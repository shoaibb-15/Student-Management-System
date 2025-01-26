package com.jsp.spring.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.studentdb.entity.Student;
import com.jsp.spring.studentdb.service.StudentService;
@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/add-student" ,method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return studentService.addStudent(student);
	}
	@RequestMapping(value = "/display-students-details" , method = RequestMethod.GET)
	public ModelAndView displayStudents( Student student) {
		return studentService.findAllStudents(student);
	}
	@RequestMapping(value = "/find-by-id" ,method = RequestMethod.GET)
	public ModelAndView findById(int studentId) {
		return studentService.findById(studentId);
	}
	@RequestMapping(value = "/update-student", method = RequestMethod.POST)
	public ModelAndView updateStudent(Student st) {
		return studentService.updateStudent(st);
	}
	
	@RequestMapping(value = "/delete-by-id",method = RequestMethod.GET)
	public ModelAndView deleteStudent(int studentId) {
		return studentService.deleteStudent(studentId);
	}
}
