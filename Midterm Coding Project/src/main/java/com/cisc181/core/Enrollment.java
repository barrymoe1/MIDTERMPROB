//
package com.cisc181.core;
import java.util.UUID;
public class Enrollment {
//Attributes
	UUID SectionID = UUID.randomUUID();
	UUID StudentID = UUID.randomUUID();
	UUID EnrollmentID = UUID.randomUUID();
	double Grade;
	
	//No arg private constructor for enrollment
	private Enrollment() {

	}
	//two-arg constructor with student ID and Section ID as parameters, 
	public Enrollment(UUID studentID2, UUID sectionID2) {
		this.StudentID = studentID2;
		this.SectionID = sectionID2;
		
		}
	//Setter for EnrollmentID
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
		
}