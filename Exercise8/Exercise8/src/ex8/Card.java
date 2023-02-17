package ex8;

public class Card {
  private String id;
  private int borrowedDate;
  private int paymentDate;
  private int bookId;
  private Student student;
  public Card(String id, int borrowedDate, int paymentDate, int bookId, Student student) {
    this.id = id;
    this.borrowedDate = borrowedDate;
    this.paymentDate = paymentDate;
    this.bookId = bookId;
    this.student = student;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public int getBorrowedDate() {
    return borrowedDate;
  }
  public void setBorrowedDate(int borrowedDate) {
    this.borrowedDate = borrowedDate;
  }
  public int getPaymentDate() {
    return paymentDate;
  }
  public void setPaymentDate(int paymentDate) {
    this.paymentDate = paymentDate;
  }
  public int getBookId() {
    return bookId;
  }
  public void setBookId(int bookId) {
    this.bookId = bookId;
  }
  public Student getStudent() {
    return student;
  }
  public void setStudent(Student student) {
    this.student = student;
  }
  @Override
  public String toString() {
    return "Card [id=" + id + ", borrowedDate=" + borrowedDate + ", paymentDate=" + paymentDate + ", bookId=" + bookId
        + ", student=" + student + "]";
  }
}
