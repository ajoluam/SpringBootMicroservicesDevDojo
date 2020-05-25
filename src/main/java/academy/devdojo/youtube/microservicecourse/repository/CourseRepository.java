package academy.devdojo.youtube.microservicecourse.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import academy.devdojo.youtube.microservicecourse.model.Course;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {

}
