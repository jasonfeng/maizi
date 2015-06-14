package com.maizi.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maizi.maven.bean.Student;
import com.maizi.maven.mapper.StudentMapper;

/**
 * 学生controlller类
 * 
 * @author Jason
 *
 */
@RestController
public class StudentController {
	/**
	 * 学生mapper对象
	 */
	@Autowired
	private StudentMapper studentMapper;

	/**
	 * 获取学生名字
	 * 
	 * @return
	 */
	@RequestMapping(value = "/get-student-name", method = RequestMethod.GET)
	public String getStudentName() {
		Student student = studentMapper.getStudent(1);
		System.out.println(student.getName());
		return student.getName();
	}
}
