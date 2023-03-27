public class Matango {
  int hp; 
//   クラスブロック内で定義された定数をフィールドと呼ぶ
  final int LEVEL = 10;
//   中でも値を書き換えないようなフィールドを定数フィールドとし、final intで宣言、定数は大文字で定義する
  char suffix;
  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は、逃げだした！");
  }
}