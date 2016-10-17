package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.*;
public class Course {
//Attributes
	UUID CourseID = UUID.randomUUID();
	String CourseUUIDString = CourseID.toString();
	String CourseName = new String();
	int GradePoints;
	private eMajor Major;
}
//