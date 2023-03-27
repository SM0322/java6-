public class Battle {
    public static void main(String[] args) {
    //   勇者よ、この世界に生まれよ！
    //   お化けキノコよ、この世界に生まれよ！
    //   勇者よ、戦え！
    //   お化けキノコよ、逃げろ！
    Hero h = new Hero();
    h.name = "湊";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を、生み出しました！");
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
    }
}