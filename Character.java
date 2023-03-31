public class Character {
  String name;
  int hp;
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
    m.hp = -= ??;
  }
  public void attack(Matango m) {
    // System.out.println(this.name + "の攻撃!");
    // m.hp = -= ??;
    // System.out.println("敵に??ポイントのダメージを与えた!")
    // attackは必ず必要だがキャラごとで内容が違う。その不都合対策の１つにattack()メソッドを空にしておく.
    // そして未来の開発者がattackをオーバーロードすればよい
  }
}