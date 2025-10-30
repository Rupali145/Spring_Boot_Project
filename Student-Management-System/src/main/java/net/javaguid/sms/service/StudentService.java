package net.javaguid.sms.service;

import java.util.List;

import net.javaguid.sms.entity.Student;

public interface StudentService 
{
	List<Student> getAllStudents();
	Student saveStudent(Student student);
}

