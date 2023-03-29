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
    // Sword s = new Sword();
    // s.name = "ぢゅらんだる";
    // s.damage = 10;
    // Hero h1;
    // h1 = new Hero();
    // h1.hp = 100;
    // h1.name = "佐藤";
    // h1.sword = s;
    // h1.attack();
    // System.out.println(h1.hp + h1.sword.name);
    // Hero h2;
    // h2 = h1;
    // h2.hp = 200;
    // System.out.println(h1.hp);
    // Theif t1 = new Theif("アサカ", 40, 5);
    // System.out.println(t1.name + t1.hp + t1.mp);
    // Theif t2 = new Theif("アサカ", 35);
    // System.out.println(t2.name + t2.hp + t2.mp);
    // Theif t3 = new Theif("アサカ");
    // System.out.println(t3.name + t3.hp + t3.mp);
    // Theif t4 = new Theif();
    // System.out.println(t4.name + t4.hp + t4.mp);
    // Hero h1 = new Hero("湊");
    // Hero h2 = new Hero();
    // h1.name = "湊";
    // h1.hp = 100;
    // System.out.println(h1.hp + h1.name + h2.hp + h2.name);
    // Hero h2 = new Hero();
    // h2.name = "浅香";
    // h2.hp = 200;
    // Wizard w = new Wizard();
    // w.name = "菅原";
    // w.hp =50;
    // w.heal(h1);
    // w.heal(h2);
    // w.heal(h2);
    // public static void heal(int hp) {
    //   hp += 10;
    //   // returnで返してないからbaseHpに変化はない
    // }
    // public static void heal(Theif theif) {
    //   theif.hp += 10;
    // }
    // public static void main (String[] args) {
    //   int baseHp = 45;
    //   Theif t = new Theif("アサカ", baseHp);
    //   heal(baseHp);
    //   System.out.println(baseHp + ":" + t.hp);
    //   heal(t);
    //   System.out.println(baseHp + ":" + t.hp);
    // }
    public static void main (String[] args) {
      // Hero h1 = new Hero("湊");
      Matango m1 = new Matango("お化け");
      // h1.attack(m1);
      // h1.slip();
      superHero sh1 = new superHero("S湊");
      sh1.attack(m1);
      sh1.run();
    }
}