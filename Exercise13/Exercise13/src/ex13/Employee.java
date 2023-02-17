package ex13;

import java.util.List;

public abstract class Employee {
  private String id;
  private String fullName;
  private String birthDay;
  private String phone;
  private String email;
  // 0: experience, 1: fresher, 2: intern
  private int employeeType;
  private List<Certificate> certificates;
  private static int employeeCount;

  public Employee(String id, String fullName, String birthDay, String phone, String email, int employeeType,
      List<Certificate> certificates) {
    this.id = id;
    this.fullName = fullName;
    this.birthDay = birthDay;
    this.phone = phone;
    this.email = email;
    this.employeeType = employeeType;
    this.certificates = certificates;
    employeeCount++;
  }

  public abstract void showMe();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(int employeeType) {
    this.employeeType = employeeType;
  }

  public static int getEmployeeCount() {
    return employeeCount;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email="
        + email + ", employeeType=" + employeeType + ", certificates=" + certificates + "]";
  }

  public List<Certificate> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<Certificate> certificates) {
    this.certificates = certificates;
  }

  public static void setEmployeeCount(int employeeCount) {
    Employee.employeeCount = employeeCount;
  }

}
