package ex1;

public class CongNhan extends CanBo {
  private int level;

  public CongNhan() {
  }

  public CongNhan(String fullName, int age, String gender, String address, int level) {
    super(fullName, age, gender, address);
    this.level = level;
  }

  public int getLevel() {
    return this.level;
  }

  public void setLevel(int level) {
    this.level = level;
  }
}
