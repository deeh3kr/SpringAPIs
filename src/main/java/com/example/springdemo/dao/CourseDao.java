package com.example.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.springdemo.entities.Course;

//it was JpaRepository instead if CrudRepository
public interface CourseDao extends JpaRepository<Course, Long> {

}
