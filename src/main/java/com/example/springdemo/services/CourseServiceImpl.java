package com.example.springdemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.dao.CourseDao;
import com.example.springdemo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	List<Course> list;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Spring", "Spring Course Desc"));
//		list.add(new Course(123, "Java", "Java course Desc"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
//		return list;
		
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		List<Course> list = new ArrayList<>();
		courseDao.findAll().forEach(list::add);
		
		Course c = null;
		for(Course course : list)
		{
			if(course.getId() == courseId)
			{
				c = course;
				break;
			}
		}
		return courseDao.getOne(courseId);
	
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		courseDao.save(course);
		
		//list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId())
//			{
//				e.setDesc(course.getDesc());
//				e.setTitle(course.getTitle());
//			}
//		});
		
		courseDao.save(course);
		
		// TODO Auto-generated method stub
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		
//		list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
//		
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}

}
