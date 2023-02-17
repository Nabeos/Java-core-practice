package ex6;

public class Student {
  private String studentClass;
  private String name;
  private int age;
  private String origin;

  public Student(String studentClass, String name, int age, String origin) {
    this.studentClass = studentClass;
    this.name = name;
    this.age = age;
    this.origin = origin;
  }

  public String getStudentClass() {
    return studentClass;
  }

  public void setStudentClass(String studentClass) {
    this.studentClass = studentClass;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  @Override
  public String toString() {
    return "Student [studentClass=" + studentClass + ", name=" + name + ", age=" + age + ", origin=" + origin + "]";
  }
}
