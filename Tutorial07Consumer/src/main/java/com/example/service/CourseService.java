package com.example.service;

import java.util.List;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

public interface CourseService
{
    List<CourseModel> selectAllCourses ();
    
    CourseModel selectCourse (String id_course);
}
