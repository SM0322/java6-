public class Theif {
  String name;
  int hp;
  int mp;
  public Theif(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public Theif(String name, int hp) {
    this.name = name;
    this.hp = hp;
    this.mp = 5;
  }
  public Theif(String name) {
    this.name = name;
    this.hp = 40;
    this.mp = 5;
  }
//   public Hero() {
//     // this.hp = 100;
//     this("ダミー");
//   }
}