package ex3;

import java.util.ArrayList;
import java.util.List;

public class CandidateManagement {
  private List<Candidate> candidates;

  public CandidateManagement() {
    candidates = new ArrayList<>();
  }
  public void addNewCandidate(Candidate candidate){
    this.candidates.add(candidate);
  }
  public void searchByCandidateNumber(String number) {
    Candidate candidate = this.candidates.stream().filter(o -> o.getCandidateNumber().equals(number)).findFirst()
        .orElse(null);
    if (candidate == null)
      System.out.println("Nothing");
    else System.out.println(candidate.toString());
  }
  public void show() {
    this.candidates.stream().forEach(o->System.out.println(o.toString()));
  }

}
