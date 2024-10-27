package iCET.edu.repository;

import iCET.edu.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}

