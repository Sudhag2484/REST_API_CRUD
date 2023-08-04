package in.sudha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sudha.binding.Course;

public interface CourseRepo  extends JpaRepository<Course, Integer>{

}
