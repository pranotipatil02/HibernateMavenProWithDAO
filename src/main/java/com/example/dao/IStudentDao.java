//interface used to define the methods
//Student - Entity class
//student- object of entity class Student
//List - interface 
package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface IStudentDao 
{
	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(int id);

	List<Student> getAllStudents();

	void deleteStudent(int id);
}
