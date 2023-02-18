package ex14.entity;

public class GoodStudent extends Student {
  private int gpa;
  private String bestRewardName;

  public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
      String gradeLevel, int gpa, String bestRewardName) {
    super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
    this.gpa = gpa;
    this.bestRewardName = bestRewardName;
  }

  @Override
  public String showMyInfor() {
    return "(Good Student) Name: " + this.getFullName() + ", Phone Number: " + this.getPhoneNumber();
  }

  public int getGpa() {
    return gpa;
  }

  public void setGpa(int gpa) {
    this.gpa = gpa;
  }

  public String getBestRewardName() {
    return bestRewardName;
  }

  public void setBestRewardName(String bestRewardName) {
    this.bestRewardName = bestRewardName;
  }

  @Override
  public String toString() {
    return "GoodStudent [" + super.toString() + ", gpa=" + gpa + ", bestRewardName=" + bestRewardName + "]";
  }

}
