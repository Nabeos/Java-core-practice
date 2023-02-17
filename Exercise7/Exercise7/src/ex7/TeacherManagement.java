package ex7;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
  private List<Teacher> teachers;

  public TeacherManagement() {
    teachers = new ArrayList<>();
  }

  public void addNewTeacher(Teacher teacher) {
    this.teachers.add(teacher);
  }

  public void delete(String teacherId) {
    Teacher teacher = getTeacherById(teacherId);
    if (teacher == null) {
      System.out.println("fail");
      return;
    }
    this.teachers.remove(teacher);
    System.out.println("Success");
  }

  public void getActualSalary(String teacherId) {
    Teacher teacher = getTeacherById(teacherId);
    if (teacher == null) {
      System.out.println("fail");
      return;
    }

    System.out.println(teacher.getSalary() + teacher.getBonus() - teacher.getPenalty());
  }

  private Teacher getTeacherById(String teacherId) {
    return this.teachers.stream().filter(o -> o.getTeacherId().equals(teacherId)).findFirst().orElse(null);
  }

}
