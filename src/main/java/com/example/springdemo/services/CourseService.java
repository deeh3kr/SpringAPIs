package com.example.springdemo.services;

import java.util.List;

import com.example.springdemo.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses(); //it will it's child class's method
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long courseId);

}
