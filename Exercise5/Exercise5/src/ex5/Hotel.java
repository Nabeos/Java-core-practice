package ex5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
  private List<Person> customers;

  public Hotel() {
    customers = new ArrayList<>();
  }

  public void addNewCustomer(Person person) {
    this.customers.add(person);
  }

  public boolean deletedCustomerById(String id) {
    Person person = this.customers.stream().filter(o -> o.getIdentification().equals(id)).findFirst().orElse(null);
    if (person == null)
      return false;
    customers.remove(person);
    return true;
  }

  public String calculateMoney(String id) {
    Person person = this.customers.stream().filter(o -> o.getIdentification().contains(id)).findFirst().orElse(null);
    if (person == null)
      return "No Data";
    int totalMoney = person.getNumberOfDayRent() * person.getRoom().getPrice();

    return "Total Money: " + totalMoney;
  }
}
