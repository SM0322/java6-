public class Hero {
  String name;
  int hp;
  // Sword sword;
  public void attack(Matango m) {
    // System.out.println(this.name + "は" + this.sword.name + "で攻撃した!");
    // System.out.println("敵に" + this.sword.damage + "ポイントダメージを与えた！");
    System.out.println(this.name + "は攻撃した!");
    m.hp -= 5;
    System.out.println("敵に５ポイントダメージを与えた！");
    System.out.println(m.hp);
  }
  
  public void run() {
    System.out.println(this.name + "は逃げ出した!");
  }
  // newされたときに自動的に動くメソッド、メソッド名がクラス名と等しい,static voidがない(戻り値が設定されていない)とコンストラクタとして認識される
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
  }
  public Hero() {
    // this.hp = 100;
    this("ダミー");
  }
  // public void attack() {
    
  // }
  // public void sleep() {
  //   this.hp = 100;
  //   System.out.println(this.name + "は、眠って回復した！");
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