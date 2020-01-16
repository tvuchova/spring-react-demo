package com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.service;

import com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.ResourseNotFoundException;
import com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.model.Course;
import com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesH2Service
{
    private final CourseRepository repository;

    public CoursesH2Service(
        final CourseRepository repository)
    {
        this.repository = repository;
    }

    public List<Course> findAll()
    {
       return  repository.findAll();
    }

    public Course save(Course course)
    {
        return repository.save(course);
    }

    public Course deleteById(long id) throws ResourseNotFoundException
    {
        Course course = findById(id);
        repository.deleteById(id);
        return course;
    }

    public Course findById(long id) throws ResourseNotFoundException
    {
        return repository.findById(id).orElseThrow(
            () -> new ResourseNotFoundException("Course not found"));
    }
}
