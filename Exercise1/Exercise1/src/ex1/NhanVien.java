package ex1;

public class NhanVien extends CanBo {
  private String task;

  public NhanVien(String fullName, int age, String gender, String address, String task) {
    super(fullName, age, gender, address);
    this.task = task;
  }

  public String getTask() {
    return this.task;
  }

  public void setTask(String task) {
    this.task = task;
  }

}
