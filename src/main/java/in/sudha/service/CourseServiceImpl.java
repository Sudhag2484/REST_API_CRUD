package in.sudha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sudha.binding.Course;
import in.sudha.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo repo;
	
	@Override
	public String upsert(Course course) {// upsert=insert+update
		repo.save(course);
		return "Success";
	}

	@Override
	public Course findById(Integer cid) {
        Optional<Course> findbyId = repo.findById(cid);
        if(findbyId.isPresent()) {
        	return findbyId.get();
        }
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
         List<Course> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public String deletById(Integer cid) {
       if(repo.existsById(cid)) {
    	   repo.deleteById(cid);
    	   return "Delete success";
       }else {
    	   return "No record Found";
       }
	
		
	}

}
