package ex14.entity;

public class NormalStudent extends Student{
  private int englishScore;
  private int entryTestScore;

  public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
      String gradeLevel, int englishScore, int entryTestScore) {
    super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
    this.englishScore = englishScore;
    this.entryTestScore = entryTestScore;
  }

  @Override
  public String showMyInfor() {
    return "(Normal Student) Name: " + this.getFullName() + ", Phone Number: " + this.getPhoneNumber();
  }

  public int getEnglishScore() {
    return englishScore;
  }

  public void setEnglishScore(int englishScore) {
    this.englishScore = englishScore;
  }

  public int getEntryTestScore() {
    return entryTestScore;
  }

  public void setEntryTestScore(int entryTestScore) {
    this.entryTestScore = entryTestScore;
  }

  @Override
  public String toString() {
    return "NormalStudent ["+super.toString()+", englishScore=" + englishScore + ", entryTestScore=" + entryTestScore + "]";
  }


}
