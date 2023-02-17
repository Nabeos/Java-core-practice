package ex3;

public class Candidate {
  private String candidateNumber;
  private String name;
  private String address;
  private int priorityLevel;

  public Candidate(String candidateNumber, String name, String address, int priorityLevel) {
    this.candidateNumber = candidateNumber;
    this.name = name;
    this.address = address;
    this.priorityLevel = priorityLevel;
  }

  public String getCandidateNumber() {
    return this.candidateNumber;
  }

  public void setCandidateNumber(String candidateNumber) {
    this.candidateNumber = candidateNumber;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPriorityLevel() {
    return this.priorityLevel;
  }

  public void setPriorityLevel(int priorityLevel) {
    this.priorityLevel = priorityLevel;
  }

  @Override
  public String toString() {
    return "Candidate number: " + this.candidateNumber + ", name: " + this.name
        + ", address: " + this.address + ", priority level: " + this.priorityLevel;
  }
}
