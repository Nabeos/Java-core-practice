package ex1;

public class KySu extends CanBo {
  private String specializedTraining;

  public KySu(String fullName, int age, String gender, String address, String specializedTraining) {
    super(fullName, age, gender, address);
    this.specializedTraining = specializedTraining;

  }

  public String getSpecializedTraining() {
    return this.specializedTraining;
  }

  public void setSpecializedTraining(String specializedTraining) {
    this.specializedTraining = specializedTraining;
  }

}
