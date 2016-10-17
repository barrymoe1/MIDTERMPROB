package com.cisc181.core;
import java.util.UUID;
public class Section {
	UUID CourseID = UUID.randomUUID();
	String CourseUUIDString = CourseID.toString();
	
	UUID SemesterID = UUID.randomUUID();
	String SemesterUUIDString = SemesterID.toString();
	
	UUID SectionID = UUID.randomUUID();
	String SectionUUIDString = SectionID.toString();
	
	UUID RoomID = UUID.randomUUID();
	String RoomUUIDString = RoomID.toString();
}
//