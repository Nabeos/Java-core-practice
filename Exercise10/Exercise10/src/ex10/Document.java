package ex10;

public class Document {
  private String text;

  public Document() {
  }

  public Document(String text) {
    this.text = text;
  }

  public int countWord(Document document) {
    int word = 0;
    String[] arr = document.text.split("\\s+");
    word = arr.length;
    return word;
  }

  public int countCharacterA(Document document) {
    long count = 0;
    count = document.text.chars().filter(ch -> ch == 'a' || ch == 'A').count();
    return (int) count;
  }

  public String standardize(Document document){
    String str = "";
    str = document.text.trim().replaceAll("\\s+", " ");
    return str;
  }
}
