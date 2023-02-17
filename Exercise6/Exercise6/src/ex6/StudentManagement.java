package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {
  private List<Student> students;

  public StudentManagement() {
    students = new ArrayList<>();
  }

  public void addNewStudent(Student student) {
    this.students.add(student);
  }

  public void showInfo() {
    this.students.stream().forEach(o -> System.out.println(o.toString()));
  }

  public List<Student> showStdInAge20() {
    return this.students.stream().filter(o -> o.getAge() == 20).collect(Collectors.toList());
  }

  public int showNumberOfStudent(int age, String origin) {
    return (int) this.students.stream().filter(o -> o.getAge() == 23 && o.getOrigin().equalsIgnoreCase(origin)).count();
  }

  static {
    Student student = new Student("6a1", "Ha", 20, "HN");
    Student student1 = new Student("6a1", "Hai", 23, "DN");

  }

  public static void main(String[] args) {
    StudentManagement management = new StudentManagement();
    Student student = new Student("6a1", "Ha", 20, "HN");
    Student student1 = new Student("6a1", "Hai", 23, "DN");
    Student student2 = new Student("6a1", "Han", 23, "DN");
    Student student3 = new Student("6a1", "Hang", 23, "DN");
    management.addNewStudent(student);
    management.addNewStudent(student1);
    management.addNewStudent(student2);
    management.addNewStudent(student3);

    management.showStdInAge20().forEach(o -> System.out.println(o.toString()));

    System.out.println(management.showNumberOfStudent(23, "DN"));
  }
}
