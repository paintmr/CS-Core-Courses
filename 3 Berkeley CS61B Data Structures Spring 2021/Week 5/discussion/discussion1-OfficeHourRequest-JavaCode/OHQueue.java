import java.util.Iterator;

public class OHQueue implements Iterable<OHRequest> {
  OHRequest queue;

  public OHQueue(OHRequest queue) {
    this.queue = queue;
  }

  @Override
  public Iterator<OHRequest> iterator() {
    // return new OHIterator(queue);
    return new TYIterator(queue);
  }

  public static void main(String[] args) {
    OHRequest s5 = new OHRequest("I deleted all of my files", "Allyson", null);
    OHRequest s42 = new OHRequest("conceptual: what is Java", "Omar2", s5);
    OHRequest s41 = new OHRequest("thank u conceptual: what is Java", "Omar1", s42);
    OHRequest s3 = new OHRequest("git: I never did lab 1", "Connor", s41);
    OHRequest s2 = new OHRequest("help", "Hug", s3);
    OHRequest s1 = new OHRequest("no I haven't tried stepping through", "Itai", s2);

    OHQueue q = new OHQueue(s1);

    for (OHRequest ohRequest : q) {
      System.out.println(ohRequest.name);
    }

    // 獲取迭代器
    // Iterator<OHRequest> i = q.iterator();
    // 用迭代器循環數字
    // while (i.hasNext()) {
    // System.out.println(i.next().name);
    // }

  }
}
