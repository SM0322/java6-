public class superHero extends Hero {
//   String name = "湊";
//   int hp = 100;
  boolean flying;
  public void attack(Matango m) {
    // System.out.println(this.name + "は" + this.sword.name + "で攻撃した!");
    // System.out.println("敵に" + this.sword.damage + "ポイントダメージを与えた！");
    super.attack(m);
    if (this.flying) {
      super.attack(m);
    }
  }
  public void run() {
    System.out.println(this.name + "は撤退した!");
  }
  public void fly() {
    this.flying = true;
    System.out.println(this.name + "は飛び上がった");
  }
  public void land() {
    this.flying = false;
    System.out.println(this.name + "は着地した");
  }
  public superHero(String name) {
    this.hp = 100;
    this.name = name;
  }
}