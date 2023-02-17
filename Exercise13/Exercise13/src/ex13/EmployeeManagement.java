package ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
  private List<Employee> employees;

  public EmployeeManagement() {
    employees = new ArrayList<>();
  }

  public void addNewEmployee(Employee employee) {
    this.employees.add(employee);
  }

  public void editExp(String id, String fullName, String birthDay, String phone, String email, int expInYear,
      String proSkill) {
    Employee employee = getEmployee(id);
    if (!fullName.isBlank() && fullName != null) {
      employee.setFullName(fullName);
    }
    if (!birthDay.isBlank() && birthDay != null) {
      employee.setBirthDay(birthDay);
    }
    if (!phone.isBlank() && phone != null)
      employee.setPhone(phone);
    if (!email.isBlank() && email != null)
      employee.setEmail(email);
    if (expInYear != 0)
      ((Experience) employee).setExpInYear(expInYear);
    if (!proSkill.isBlank() && proSkill != null)
      ((Experience) employee).setProSkill(proSkill);
  }

  public void editIntern(String id, String fullName, String birthDay, String phone, String email, String majors,
      String semester, String universityName) {
    Employee employee = getEmployee(id);
    if (!fullName.isBlank() && fullName != null) {
      employee.setFullName(fullName);
    }
    if (!birthDay.isBlank() && birthDay != null) {
      employee.setBirthDay(birthDay);
    }
    if (!phone.isBlank() && phone != null)
      employee.setPhone(phone);
    if (!email.isBlank() && email != null)
      employee.setEmail(email);
    if (!semester.isBlank() && semester != null)
      ((Intern) employee).setSemester(semester);
    if (!majors.isBlank() && majors != null)
      ((Intern) employee).setMajors(majors);
    if (!universityName.isBlank() && universityName != null)
      ((Intern) employee).setUniversityName(universityName);
  }

  public void editFresher(String id, String fullName, String birthDay, String phone, String email, String graduationDate,
      String graduationRank, String education) {
    Employee employee = getEmployee(id);
    if (!fullName.isBlank() && fullName != null) {
      employee.setFullName(fullName);
    }
    if (!email.isBlank() && birthDay != null) {
      employee.setBirthDay(birthDay);
    }
    if (!phone.isBlank() && phone != null)
      employee.setPhone(phone);
    if (!email.isBlank() && email != null)
      employee.setEmail(email);
    if (!graduationDate.isBlank() && graduationDate != null)
      ((Fresher) employee).setGraduationDate(graduationDate);
    if (!graduationRank.isBlank() && graduationRank != null)
      ((Fresher) employee).setGraduationRank(graduationRank);
    if (!education.isBlank() && education != null)
      ((Fresher) employee).setEducation(education);
  }

  public void delete(String id) {
    Employee employee = getEmployee(id);
    if (employee == null) {
      System.out.println("Fail");
      return;
    }
    employees.remove(employee);
    Employee.setEmployeeCount(Employee.getEmployeeCount()-1);
    System.out.println("Success");
  }

  public List<Employee> findByType(int type) {
    return this.employees.stream().filter((o) -> {
      if (type == 0)
        return o instanceof Experience;
      if (type == 1)
        return o instanceof Fresher;
      if (type == 2)
        return o instanceof Intern;
      return false;
    }).collect(Collectors.toList());
  }

  public Employee getEmployee(String id) {
    return this.employees.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
  }

  public void showAll() {
    this.employees.stream().forEach(o->System.out.println(o.toString()));
  }

}
