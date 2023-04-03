public class Wizard {
  // int mp;
  // // public void heal(Hero h) {
  // //   h.hp += 10;
  // //   System.out.println(h.name + "のHPは１０回復した！");
  // // }
  // public void attack(Matango m) {
  //   System.out.println(this.name + "は火の玉を放った!");
  //   System.out.println("敵に20ポイントのダメージ！");
  //   m.hp -= 20;
  //   this.mp -= 5;
  // }
  // public void fireball(Matango m) {
  //   System.out.println(this.name + "は火の玉を放った!");
  //   System.out.println("敵に20ポイントのダメージ！");
  //   m.hp -= 20;
  //   this.mp -= 5;
  // }
  // public Wizard() {
  //   this.hp = 100;
  //   this.mp = 100;
  //   this.name = "湊";
  // }
  private int hp;
  private int mp;
  private String name;
  private Wand wand = new Wand();
  public void heal (Wizard w) {
    int basePoint = 10;
    int recoverPoint = (int) (basePoint * wand.getpower());
    w.setHp(w.getHp() + recoverPoint);
    System.out.println(w.getName() + "のHPを" + recoverPoint + "回復した！");
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    if (name == null || name.length() <= 3) {
       throw new IllegalArgumentException ("名前がnullです。処理を中断");
     }
    this.name = name;
  }
  public int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    if (hp < 0) {
       this.hp = 0;
     }
    else { this.hp = hp; }
  }
  public int getMp() {
    return this.mp;
  }
  public void setMp(int mp) {
    if (mp < 0) {
       throw new IllegalArgumentException ("値が正しくありません。処理を中断");
     }
    this.mp = mp;
  }
  public Wand getWand() {
    return this.wand;
  }
  public void setWand(Wand wand) {
    if (wand == null) {
       throw new IllegalArgumentException ("wandが装備されていません。処理を中断");
     }
    this.wand = wand;
  }
  public Wizard() {
    this.hp = 100;
    this.mp = 100;
    this.name = "ダミー";
  }
}