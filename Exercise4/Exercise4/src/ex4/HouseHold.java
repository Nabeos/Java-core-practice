package ex4;

import java.util.List;

public class HouseHold {
  private String address;
  private int numberOfMember;
  private List<Person> familyMembers;

  public HouseHold(String address, int numberOfMember, List<Person> familyMembers) {
    this.address = address;
    this.numberOfMember = numberOfMember;
    this.familyMembers = familyMembers;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getNumberOfMember() {
    return this.numberOfMember;
  }

  public void setNumberOfMember(int numberOfMember) {
    this.numberOfMember = numberOfMember;
  }

  public List<Person> getFamilyMembers() {
    return this.familyMembers;
  }

  public void setFamilyMembers(List<Person> familyMembers) {
    this.familyMembers = familyMembers;
  }

  @Override
  public String toString() {
    return "Address: "+ this.address+"\n"
    +"No of Member: "+this.numberOfMember+"\n"
    +"List of member: \n"+this.familyMembers;
  }

}
