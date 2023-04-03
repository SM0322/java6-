public class Hero {
  String name;
  private int hp;
  Sword sword;
  // public void attack(Matango m) {
  //   // System.out.println(this.name + "は" + this.sword.name + "で攻撃した!");
  //   // System.out.println("敵に" + this.sword.damage + "ポイントダメージを与えた！");
  //   System.out.println(this.name + "は攻撃した!");
  //   m.hp -= 10;
  //   System.out.println("敵に10ポイントダメージを与えた！");
  //   System.out.println(m.hp);
  // }
  public void bye() {
    System.out.println("勇者は別れを告げた");
  }
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
  }
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void attack(Monster m) {
    // System.out.println(this.name + "は" + this.sword.name + "で攻撃した!");
    // System.out.println("敵に" + this.sword.damage + "ポイントダメージを与えた！");
    System.out.println(this.name + "は攻撃した!");
    // m.hp -= 10;
    System.out.println("敵に10ポイントダメージを与えた！");
    // System.out.println(m.hp);
    System.out.println("モンスターから2ポイントのダメージを受けた！");
    this.hp -= 100;
    if (this.hp <= 0) {
      this.die();
    }
  }
  
  public void run() {
    System.out.println(this.name + "は逃げ出した!");
  }
  public final void slip() {
    System.out.println(this.hp);
    this.hp -= 5;
    System.out.println(this.name + "は転んだ");
    System.out.println(this.hp);
  }
  // newされたときに自動的に動くメソッド、メソッド名がクラス名と等しい,static voidがない(戻り値が設定されていない)とコンストラクタとして認識される
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
  }
  public Hero() {
    // this.hp = 100;
    System.out.println("Heroのコンストラクトが起動");
    // this("ダミー");
  }
  // public void attack() {
    
  // }
  
  // public void sit(int sec) {
  //   this.hp += sec;
  //   System.out.println(this.name + "は、" + sec + "秒座った！");
  //   System.out.println("HPが" + sec + "ポイント回復した！");
  // }
  // public void slip() {
  //   this.hp -= 5;
  //   System.out.println(this.name + "は、転んだ！");
  //   System.out.println("HPは" + this.hp + "になった！");
  // }
  // public void run() {
  //   System.out.println(this.name + "は、逃げだした！");
  // }
}