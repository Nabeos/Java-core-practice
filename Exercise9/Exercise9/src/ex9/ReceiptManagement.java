package ex9;

import java.util.ArrayList;
import java.util.List;

public class ReceiptManagement {
  private List<Receipt> receipts;

  public ReceiptManagement() {
    receipts = new ArrayList<>();
  }

  public void addNewReceipt(Receipt receipt) {
    this.receipts.add(receipt);
  }

  public double calculateMoney(Receipt receipt) {
    return (receipt.getNewElectricityIndex() - receipt.getOldElectricityIndex()) * 5;
  }

  public Receipt findReceiptByHouseHold(HouseHold houseHold) {
    return this.receipts.stream().filter(o -> o.getHouseHold().getElectricMeter().equals(houseHold.getElectricMeter()))
        .reduce((first, second) -> second).orElse(null);
  }
}
