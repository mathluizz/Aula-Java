package model.entities;

import java.util.List;
import java.util.Objects;

public class Course {
    private String nameCourse;
    private int accessNumber;

    public Course(int accessNumber) {
        this.accessNumber = accessNumber;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return accessNumber == course.accessNumber && Objects.equals(nameCourse, course.nameCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCourse, accessNumber);
    }
}
