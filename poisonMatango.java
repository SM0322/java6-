public class poisonMatango extends Matango {
  public poisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    // System.out.println(this.name + "は" + this.sword.name + "で攻撃した!");
    // System.out.println("敵に" + this.sword.damage + "ポイントダメージを与えた！");
    super.attack(h);
    for (int i = 5; i > 0; i--) {
      System.out.println("さらに毒をばらまいた！");
      int damage = h.hp / 5;
      h.hp -= damage;
      System.out.println(damage + "ポイントのダメージ！");
      }
  }
}