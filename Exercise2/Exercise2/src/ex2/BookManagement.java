package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookManagement {
  private List<Document> documents;

  public BookManagement() {
    documents = new ArrayList<>();
  }

  public void addNewDocument(Document doc) {
    this.documents.add(doc);
  }

  public boolean deleteDocumentById(String id) {
    Document doc = this.documents.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
    if(doc == null){
      return false;
    }
    this.documents.remove(doc);
    return true;
  }

  public void showDocumentsInfo() {
    this.documents.forEach(o -> System.out.println(o.toString()));
  }

  public List<Document> searchDocByMagazineType() {
    return this.documents.stream().filter(o -> o instanceof Magazine).collect(Collectors.toList());
  }
  public List<Document> searchDocByNewsType() {
    return this.documents.stream().filter(o -> o instanceof Newspaper).collect(Collectors.toList());
  }
  public List<Document> searchDocByBookType() {
    return this.documents.stream().filter(o -> o instanceof Book).collect(Collectors.toList());
  }
}
