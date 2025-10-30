package net.javaguid.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguid.sms.entity.Student; 
public interface StudentRepository extends JpaRepository<Student,Long>
{

}
 