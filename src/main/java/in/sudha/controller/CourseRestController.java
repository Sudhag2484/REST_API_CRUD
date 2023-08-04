package in.sudha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sudha.binding.Course;
import in.sudha.service.CourseService;

@RestController
public class CourseRestController {
	
	
	@Autowired
	private CourseService serive;
	
	@PostMapping("/course")//this for insert
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String status = serive.upsert(course);
		return  new ResponseEntity<>(status,HttpStatus.CREATED);
	}

	@PutMapping("/course")//this for update
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = serive.upsert(course);
		return  new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourseById(@PathVariable Integer cid){
              Course status = serive.findById(cid);
              return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourse(){
		List<Course> allCourse = serive.getAllCourse();
		return new ResponseEntity<>(allCourse,HttpStatus.OK);
		
	}
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
		String delete = serive.deletById(cid);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	
	}

}
