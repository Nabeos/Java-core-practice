package ex2;

public class Newspaper extends Document {
  private int releaseDay;

  public Newspaper(String id, String publisher, int publishQuantity, int releaseDay) {
    super(id, publisher, publishQuantity);
    this.releaseDay = releaseDay;
  }

  public int getReleaseDay() {
    return this.releaseDay;
  }

  public void setReleaseDay(int releaseDay) {
    this.releaseDay = releaseDay;
  }

  @Override
  public String toString() {
    return "{" +
        super.toString() +
        ", releaseDay='" + getReleaseDay() + "'" +
        "}";
  }

}
