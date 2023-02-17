package ex5;

public class Person {
  private String name;
  private int age;
  private String identification;
  private Room room;
  private int numberOfDayRent;

  public Person(String name, int age, String identification, Room room, int numberOfDayRent) {
    this.name = name;
    this.age = age;
    this.identification = identification;
    this.room = room;
    this.numberOfDayRent = numberOfDayRent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public int getNumberOfDayRent() {
    return numberOfDayRent;
  }

  public void setNumberOfDayRent(int numberOfDayRent) {
    this.numberOfDayRent = numberOfDayRent;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", identification=" + identification + ", room=" + room
        + ", numberOfDayRent=" + numberOfDayRent + "]";
  }


}
