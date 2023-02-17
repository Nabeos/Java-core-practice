import ex10.Document;

public class Ex10Main {
    public static void main(String[] args) throws Exception {
        Document document = new Document("This  is a normal   text ");
        System.out.println(document.countCharacterA(document));
        System.out.println(document.countWord(document));
        System.out.println(document.standardize(document));
    }
}
