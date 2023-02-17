package ex2;

public class Book extends Document {
  private String authorName;
  private int totalPage;

  public Book() {
  }

  public Book(String id, String publisher, int publishQuantity, String authorName, int totalPage) {
    super(id, publisher, publishQuantity);
    this.authorName = authorName;
    this.totalPage = totalPage;
  }

  public String getAuthorName() {
    return this.authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public int getTotalPage() {
    return this.totalPage;
  }

  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }

  @Override
  public String toString() {
    return "{" +
        super.toString() +
        ", authorName='" + getAuthorName() + "'" +
        ", totalPage='" + getTotalPage() + "'" +
        "}";
  }

}
