package ex13;

import java.util.List;

public class Fresher extends Employee{
  private String graduationDate;
  private String graduationRank;
  private String education;

  public Fresher(String id, String fullName, String birthDay, String phone, String email, int employeeType,
      List<Certificate> certificates, String graduationDate, String graduationRank, String education) {
    super(id, fullName, birthDay, phone, email, employeeType, certificates);
    this.graduationDate = graduationDate;
    this.graduationRank = graduationRank;
    this.education = education;
  }
  public String getGraduationDate() {
    return graduationDate;
  }
  public void setGraduationDate(String graduationDate) {
    this.graduationDate = graduationDate;
  }
  public String getGraduationRank() {
    return graduationRank;
  }
  public void setGraduationRank(String graduationRank) {
    this.graduationRank = graduationRank;
  }
  public String getEducation() {
    return education;
  }
  public void setEducation(String education) {
    this.education = education;
  }
  @Override
  public String toString() {
    return "Fresher ["+super.toString()+", graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
        + education + "]";
  }
  @Override
  public void showMe() {
    // TODO Auto-generated method stub
    System.out.println(this.toString());
  }

}
