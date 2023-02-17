package ex3;

public class CandidateC extends Candidate {
  private final static String VAN = "Van";
  private final static String SU = "Su";
  private final static String DIA = "Dia";

  public CandidateC(String candidateNumber, String name, String address, int priorityLevel) {
    super(candidateNumber, name, address, priorityLevel);
  }

  @Override
  public String toString() {
    return super.toString() + ", Group C: " + VAN + ", " + SU + ", " + DIA;
  }
}
