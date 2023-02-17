package ex3;

public class CandidateB extends Candidate {
  private final static String TOAN = "Toan";
  private final static String HOA = "Hoa";
  private final static String SINH = "Sinh";

  public CandidateB(String candidateNumber, String name, String address, int priorityLevel) {
    super(candidateNumber, name, address, priorityLevel);
  }

  @Override
  public String toString() {
    return super.toString() + ", Group B: " + TOAN + ", " + HOA + ", " + SINH;
  }
}
