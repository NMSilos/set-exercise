package entities;

import java.util.Objects;

public class Student {

    private Integer studentId;

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student students = (Student) o;
        return Objects.equals(studentId, students.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

}
