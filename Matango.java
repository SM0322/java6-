public class Matango {
//   int hp; 
// //   クラスブロック内で定義された定数をフィールドと呼ぶ
//   final int LEVEL = 10;
// //   中でも値を書き換えないようなフィールドを定数フィールドとし、final intで宣言、定数は大文字で定義する
//   char suffix;
//   public void run() {
//     System.out.println("お化けキノコ" + this.suffix + "は、逃げだした！");
//   }
  // String name;
  int hp;
  char suffix;
  // public Matango(String name) {
  //   this.hp = 100;
  //   this.name = name;
  // }
  public Matango(char suffix) {
    this.suffix = suffix;
  }
  public void attack(Hero h) {
    System.out.println("キノコ" + this.suffix + "の攻撃!");
    System.out.println("10のダメージ!");
    h.hp -= 10;
  }
}