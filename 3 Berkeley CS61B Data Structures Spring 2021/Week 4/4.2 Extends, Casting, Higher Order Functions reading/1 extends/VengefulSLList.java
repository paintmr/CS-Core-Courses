public class VengefulSLList<Item> extends SLList<Item> {
  SLList<Item> deletedItems;
  public VengefulSLList(){
    deletedItems = new SLList<>();
  }
  // 上面三行代码相当于：
  // SLList<Item> deletedItems = new SLList<>();

  public VengefulSLList(Item x){
    super(x);
    deletedItems = new SLList<>();
  }

  @Override
  public Item removeLast() {
    // calls Superclass's version of removeLast()
    Item last = super.removeLast();
    deletedItems.addLast(last);
    return last;
  }

  public void printLostItems() {
    deletedItems.print();
  }

  public static void main(String[] args) {
    VengefulSLList<Integer> vs1 = new VengefulSLList<>(111);
    vs1.addLast(1);
    vs1.addLast(5);
    vs1.addLast(10);
    vs1.addLast(13);
    vs1.print(); // 1 5 10 13
    vs1.removeLast();
    vs1.removeLast();
    System.out.print("The fallen are: ");
    vs1.printLostItems(); // 13 10

  }
}