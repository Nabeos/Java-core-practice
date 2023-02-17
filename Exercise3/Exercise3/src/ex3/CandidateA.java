package ex3;

public class CandidateA extends Candidate{
  private final static String TOAN = "Toan";
  private final static String LY = "Ly";
  private final static String HOA = "Hoa";
  public CandidateA(String candidateNumber, String name, String address, int priorityLevel) {
    super(candidateNumber, name, address, priorityLevel);
  }

  @Override
  public String toString() {
    return super.toString()+", Group A: "+TOAN+", "+LY+", "+ HOA;
  }

}
