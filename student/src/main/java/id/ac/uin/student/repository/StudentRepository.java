package id.ac.uin.student.repository;

import id.ac.uin.student.entity.Student;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
   Optional<Student> findByEmail (String email);

   Optional<Student> findByid(Long id);
}
