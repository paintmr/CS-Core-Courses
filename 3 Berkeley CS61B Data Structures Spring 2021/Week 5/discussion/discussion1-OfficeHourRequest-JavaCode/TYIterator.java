public class TYIterator extends OHIterator {
  public TYIterator(OHRequest queue) {
    super(queue);
  }

  @Override
  public OHRequest next() {
    OHRequest result = super.next();
    if (result != null && result.description.contains("thank u")) {
      result = super.next();
      // 不能写result = result.next。假设result的节点是1，result.next节点为2。即便这里写了result =
      // result.next，把当前result节点设置为2，但这并没有改变OHIterator的节点记录，OHIterator记录的下一个节点还是2，但下一轮iterator还是会用OHIterator得到result的节点为2。2这个节点就会被打印2次。
    }
    return result;
  }
}
