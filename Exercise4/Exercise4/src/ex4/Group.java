package ex4;

import java.util.ArrayList;
import java.util.List;

public class Group {
  private List<HouseHold> houseHolds;

  public Group() {
    this.houseHolds = new ArrayList<>();
  }

  public void addNewHouseHold(HouseHold houseHold) {
    this.houseHolds.add(houseHold);
  }

  public void showInfoHouseHold(){
    this.houseHolds.stream().forEach(o->System.out.println(o.toString()));
  }
}
