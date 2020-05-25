package academy.devdojo.youtube.microservicecourse.endpoint.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.youtube.microservicecourse.endpoint.service.CourseService;
import academy.devdojo.youtube.microservicecourse.model.Course;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
public class CourseController {

	private final CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Course>> list (Pageable pageable){
		log.info("Controller - Listing all Courses");
		return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
	}
	
	
	
	
}
