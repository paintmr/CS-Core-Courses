public class MainClass {
  public static void main(String[] args) {
    // 創建抽獎器對象，指定數據類型
    ProductGetter<String> stringProductGetter = new ProductGetter<>();

    // 給抽獎器填充獎品
    String[] strProducts = { "蘋果手機", "掃地機器人", "咖啡機", "掛燙機", "捲髮棒" };
    for (int i = 0; i < strProducts.length; i++) {
      stringProductGetter.addProduct(strProducts[i]);
    }

    // 抽獎
    String productl = stringProductGetter.getProduct();
    System.out.println("恭喜您，抽中了：" + productl);
  }
}
