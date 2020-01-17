package com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.service;

import com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.ResourseNotFoundException;
import com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.model.Course;

import java.util.List;

public interface CourseService
{
    List<Course> findAll();
    Course save(Course course);
    Course deleteById(long id) throws ResourseNotFoundException;
    Course findById(long id) throws ResourseNotFoundException;
}
