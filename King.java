public class King {
  void talk(Hero h) {
    // System.out.println("ようこそ我が国へ、" + h.name + "よ！");
    System.out.println("ようこそ我が国へ、" + h.getName() + "よ！");
    // getNameではreturnにてh.nameを返している
    // System.out.println("ようこそ我が国へ、" + h.setName("信之介") + "よ！");
    h.setName("123456789");
  }
}