package ex2;

public class Magazine extends Document {
  private String releaseNumber;
  private int releaseMonth;

  public Magazine(String id, String publisher, int publishQuantity, String releaseNumber, int releaseMonth) {
    super(id, publisher, publishQuantity);
    this.releaseNumber = releaseNumber;
    this.releaseMonth = releaseMonth;
  }

  public String getReleaseNumber() {
    return this.releaseNumber;
  }

  public void setReleaseNumber(String releaseNumber) {
    this.releaseNumber = releaseNumber;
  }

  public int getReleaseMonth() {
    return this.releaseMonth;
  }

  public void setReleaseMonth(int releaseMonth) {
    this.releaseMonth = releaseMonth;
  }

  @Override
  public String toString() {
    return "{" +
        super.toString() +
        ", releaseNumber='" + getReleaseNumber() + "'" +
        ", releaseMonth='" + getReleaseMonth() + "'" +
        "}";
  }

}
