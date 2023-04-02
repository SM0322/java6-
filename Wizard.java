public class Wizard extends Character {
  int mp;
  // public void heal(Hero h) {
  //   h.hp += 10;
  //   System.out.println(h.name + "のHPは１０回復した！");
  // }
  public void attack(Matango m) {
    System.out.println(this.name + "は火の玉を放った!");
    System.out.println("敵に20ポイントのダメージ！");
    m.hp -= 20;
    this.mp -= 5;
  }
  public Wizard() {
    this.hp = 100;
    this.mp = 100;
    this.name = "湊";
  }
}