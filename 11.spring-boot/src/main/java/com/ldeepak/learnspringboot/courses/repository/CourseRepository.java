package com.ldeepak.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldeepak.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
