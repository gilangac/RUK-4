class Course {
    private String courseName;
    private Teacher teacher;
    private boolean isLabCourse;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;

        if (courseName.equalsIgnoreCase("Computer Science")) {
            isLabCourse = true;
        } else {
            isLabCourse = false;
        }
    }

    // long method: karena set course, set teacher dsb
    // bisa juga long parameter list karena parameternya sangat banyak
    public void setCourse(String courseName, boolean isLabCourse, String teacherName, int teacherAge, String teacherSubject) {
        this.courseName = courseName;
        this.teacher = new Teacher(teacherName, teacherAge, teacherSubject);
        this.isLabCourse = isLabCourse;

        System.out.println("Course ini bernama: " + courseName);
        System.out.println("Course ini diajar oleh: " + teacher.name);
        System.out.println("Apakah diajar di lab? " + (isLabCourse ? "Ya" : "Tidak"));
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Taught by: " + teacher.name);
        System.out.println("Lab Course: " + (isLabCourse ? "Yes" : "No"));
    }
}