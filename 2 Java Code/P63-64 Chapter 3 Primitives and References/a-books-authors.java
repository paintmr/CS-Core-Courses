class BooksTestDrive {

  public static void main(String[] args) {
    Books[] myBooks = new Books[3];
    int x = 0;

    myBooks[0] = new Books(); // 新加的代码
    myBooks[1] = new Books();// 新加的代码
    myBooks[2] = new Books();// 新加的代码

    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
    myBooks[0].author = "Bob";
    myBooks[1].author = "Sue";
    myBooks[2].author = "Ian";

    while (x < 3) {
      System.out.print(myBooks[x].title);
      System.out.print(" by ");
      System.out.println(myBooks[x].author);
      x = x + 1;
    }
  }
}

class Books {
  String title;
  String author;
}

// 把上述2个类互换位置

// 打印的内容
// The Grapes of Java by Bob
// The Java Gatsby by Sue
// The Java Cookbook by Ian