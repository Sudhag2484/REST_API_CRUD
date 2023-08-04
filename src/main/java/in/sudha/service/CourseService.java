package in.sudha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sudha.binding.Course;

@Service
public interface CourseService {
	
	public String upsert(Course course);//insert +update
	
	public Course findById(Integer cid);
	
	public List<Course> getAllCourse();
	
	public String deletById(Integer cid);
	
	

}
