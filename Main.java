// import comment.Zenhan;
// import comment.Kouhan;

// public class Main {
//     public static void main(String[] args) throws Exception {
//       Zenhan.doWarusa();
//       Zenhan.doTogame();
//       Kouhan.callDeae();
//       Kouhan.showMondokoro();
//     }
// }

public class Main {
  public static void main (String[] args) {
    Sword s = new Sword();
    s.name = "ぢゅらんだる";
    s.damage = 10;
    Hero h1;
    h1 = new Hero();
    h1.hp = 100;
    h1.name = "佐藤";
    h1.sword = s;
    h1.attack();
    System.out.println(h1.hp + h1.sword.name);
    Hero h2;
    h2 = h1;
    h2.hp = 200;
    System.out.println(h1.hp);
  }
}