package ex4;

public class Person {
  private String name;
  private int age;
  private String job;
  private String identification;

  public Person(String name, int age, String job, String identification) {
    this.name = name;
    this.age = age;
    this.job = job;
    this.identification = identification;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJob() {
    return this.job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getIdentification() {
    return this.identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  @Override
  public String toString() {
    return
      " name='" + getName() + "'" +
      ", age='" + getAge() + "'" +
      ", job='" + getJob() + "'" +
      ", identification='" + getIdentification() + "'";
  }

}
