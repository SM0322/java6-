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
      // Matango m1 = new Matango("お化け");
      // h1.attack(m1);
      // h1.slip();
      // superHero sh1 = new superHero("S湊");
      // sh1.attack(m1);
      // sh1.run();
      // Weapon w = new Weapon();
      // System.out.println(w.name);
      // superHero sh = new superHero("湊");
      // Wizard w = new Wizard();
      // System.out.println(w.mp);
      // poisonMatango pm = new poisonMatango('A');
      // System.out.println(pm.hp);
      // sh.attack(pm);
      // System.out.println(pm.hp);
      // w.attack(pm);
      // System.out.println(w.mp);
      // System.out.println(pm.hp);
      // Character c = new Wizard();
      // 下の構文ではエラーが出る
      // Wizard w = c;
      // この構文でなら()の演算子によりコンパイラが通る
      // Wizard w = (Wizard)c;
      // poisonMatango pm2 = new poisonMatango('B');
      // System.out.println(pm2.hp);
      // c.fireball(pm2);
      // if (c instanceof Wizard) {
      //   Wizard w = (Wizard)c;
      //   c.attack(pm2);
      // }
      // System.out.println(pm2.hp);
      // pm.attack(h);
      // Yusya y = new Yusya();
      // y.attack(pm);
      // Slime s = new Slime(); Monster m = new Slime();
      // s.run(); m.run();
      // Hero h1 = new Hero();
      // Hero h2 = new Hero();
      // Theif t1 = new Theif();
      // Wizard w1 = new Wizard();
      // Wizard w2 = new Wizard();
      // h1.hp += 50;
      // h2.hp += 50;
      // t1.hp += 50;
      // w1.hp += 50;
      // w2.hp += 50;
      // Character[] c = new Character[5];
      // c[0] = new Hero();
      // c[1] = new Hero();
      // c[2] = new Theif();
      // c[3] = new Wizard();
      // c[4] = new Wizard();
      // for (character ch : c) {
      //   ch.hp += 50;
      // }
      Y[] array = new Y[2];
      array[0] = new A();
      array[1] = new B();
      for (Y y : array) {
        y.b();
      }
      Hero h = new  Hero("湊");
      poisonMatango pm2 = new poisonMatango('B');
      h.attack(pm2);
      King k = new King();
      k.talk(h);
    }
}