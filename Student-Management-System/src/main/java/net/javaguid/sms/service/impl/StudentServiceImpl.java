package net.javaguid.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguid.sms.entity.Student;
import net.javaguid.sms.repository.StudentRepository;
import net.javaguid.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepository studentRepository;
	public StudentServiceImpl(net.javaguid.sms.repository.StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
