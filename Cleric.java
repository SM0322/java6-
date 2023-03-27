public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;
  public void selfaid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("最大までHPが回復した!");
  }
  public void pray(int sec) {
    System.out.println(this.name + "は、祈った！");
    // int num = new java.util.Random().nextInt(3);
    int recover = new java.util.Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した!");
  }
}