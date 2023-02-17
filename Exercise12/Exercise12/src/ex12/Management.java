package ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Management {
  List<Transportation> transportation;

  public Management() {
    transportation = new ArrayList<>();
  }

  public void addNewTrans(Transportation trans){
    this.transportation.add(trans);
  }
  public void delete(String id){
    Transportation trans = this.transportation.stream().filter(o->o.getId().equals(id)).findFirst().orElse(null);
    if(trans == null){
      System.out.println("Fail");
      return;
    }
    transportation.remove(trans);
    System.out.println("Success");
  }
  public List<Transportation> searchByBrand(String brand){
    return this.transportation.stream().filter(o->o.getBrand().contains(brand)).collect(Collectors.toList());
  }

  public List<Transportation> searchByColor(String color){
    return this.transportation.stream().filter(o->o.getBrand().equals(color)).collect(Collectors.toList());
  }
}
