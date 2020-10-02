package com.phlps.mynotes

class CourseInfo(val courseId:String, val title:String)

class NoteInfo(var course:CourseInfo, var title: String, var test:String)