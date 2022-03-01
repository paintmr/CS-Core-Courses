public interface OurComparable {
  /**
   * Return negative if this is less than o.
   * Return 0 if this equals o.
   * Return positive if this is larger than o.
   */
  public int compareTo(Object o);
  // 上面的代码也可以写成
  // public int compareTo(OurComparable o);
}