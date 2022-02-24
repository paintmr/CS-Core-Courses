public class RotatingSLList<Item> extends SLList<Item> {
  public static void main(String[] args) {
    RotatingSLList<Integer> rList = new RotatingSLList<>();
    rList.addLast(10);
    rList.addLast(11);
    rList.addLast(12);
    rList.addLast(13);
    rList.print(); // 10 11 12 13

    rList.rotateRight();
    rList.print(); // 13 10 11 12

  }

  public void rotateRight() {
    // 移动3个箭头指向：last，sentinel，2n last
    // 移动顺序决定原则：被箭头指向的节点必须有2个箭头指着，这样移走其中一个箭头，该节点不会丢失
    // 移动顺序：（1）last从sentinel/null指向1st，（2）sentinel从1st指向last，（3）2nd
    // last从last指向sentinel/null
    // 结果：(1) last 变成1st，其它所有节点往后移动1个位置

    // 或者直接用super class里面的methods
    Item x = removeLast();
    addFirst(x);
  }
}