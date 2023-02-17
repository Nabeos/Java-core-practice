package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utils.Validation;

public class QLCB {
  private List<CanBo> canBos;

  public QLCB() {
    canBos = new ArrayList<>();
  }

  public void themMoiCanBo(CanBo canBo) {
    this.canBos.add(canBo);
  }

  public List<CanBo> timKiemTheoHoTen(String name) {
    return this.canBos.stream().filter(o -> o.getFullName().contains(name)).collect(Collectors.toList());
  }

  public void hienThiThongTinDanhSachCanBo() {
    this.canBos.forEach(o -> System.out.println(o.toString()));
  }
}
