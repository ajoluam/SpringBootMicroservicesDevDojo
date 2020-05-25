package academy.devdojo.youtube.microservicecourse.endpoint.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.microservicecourse.model.Course;
import academy.devdojo.youtube.microservicecourse.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class CourseService {
	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	public Iterable<Course> list(Pageable pageable){
		log.info("Service - Listing all Courses");
		return courseRepository.findAll(pageable);
	}
	
}
