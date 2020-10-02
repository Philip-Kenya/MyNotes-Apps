package com.phlps.mynotes

class DataManager {
    val courses= HashMap<String, CourseInfo>()
    val notes=ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses()
    {
    var course=CourseInfo("android_intent","Android Programming with intents")
        courses.set(course.courseId,course)
        course=CourseInfo("android_async","Android async Programming with intents")
        courses.set(course.courseId,course)
        course=CourseInfo(title="Java Fundamentals:Java Language", courseId = "Android async Programming with intents")
        courses.set(course.courseId,course)
        course=CourseInfo("Java_Core","Java Fundamentals:The core platform")
        courses.set(course.courseId,course)
    }

}