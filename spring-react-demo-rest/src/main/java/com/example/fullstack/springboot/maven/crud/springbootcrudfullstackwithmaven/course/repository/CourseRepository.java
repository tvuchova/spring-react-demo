package com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.repository;

import com.example.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository
    extends JpaRepository<Course, Long>
{ }
