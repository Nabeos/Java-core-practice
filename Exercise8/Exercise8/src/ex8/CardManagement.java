package ex8;

import java.util.ArrayList;
import java.util.List;

public class CardManagement {
  private List<Card> cards;

  public CardManagement() {
    cards = new ArrayList<>();
  }

  public void addNewCard(Card card) {
    this.cards.add(card);
  }

  public void delete(String id) {
    Card card = this.cards.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
    if (card == null) {
      System.out.println("Fail");
      return;
    }
    this.cards.remove(card);
    System.out.println("Success");
  }

  public void show() {
    this.cards.stream().forEach(o -> System.out.println(o.toString()));
  }

}
