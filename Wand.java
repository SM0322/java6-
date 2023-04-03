public class Wand {
  private String name;
  private double power;
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    if (name == null || name.length() <= 3) {
       throw new IllegalArgumentException ("名前がnullです。処理を中断");
     }
    this.name = name;
  }
  public double getpower() {
    return this.power;
  }
  public void setPower(double power) {
    if (power <= 0.5 || power >= 100) {
       throw new IllegalArgumentException ("魔力違い場です。処理を中断");
     }
    this.power = power;
  }
  public Wand() {
    this.name = "ダミー";
    this.power = 5.0;
  }
}