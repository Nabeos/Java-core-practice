package ex2;

public class Document {
  private String id;
  private String publisher;
  private int publishQuantity;

  public Document() {
  }

  public Document(String id, String publisher, int publishQuantity) {
    this.id = id;
    this.publisher = publisher;
    this.publishQuantity = publishQuantity;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public int getPublishQuantity() {
    return this.publishQuantity;
  }

  public void setPublishQuantity(int publishQuantity) {
    this.publishQuantity = publishQuantity;
  }


  @Override
  public String toString() {
    return
      " id='" + getId() + "'" +
      ", publisher='" + getPublisher() + "'" +
      ", publishQuantity='" + getPublishQuantity() + "'" ;
  }
}
