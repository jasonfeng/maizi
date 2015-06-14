package com.maizi.maven.mapper;

import com.maizi.maven.bean.Student;

/**
 * 学生数据库操作接口
 * 
 * @author Jason
 *
 */
public interface StudentMapper {
	/**
	 * 获取学生信息
	 * 
	 * @param id
	 * @return
	 */
	Student getStudent(int id);
}
