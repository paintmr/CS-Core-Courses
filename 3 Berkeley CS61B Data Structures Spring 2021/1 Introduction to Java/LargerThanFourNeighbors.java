import java.util.*;
import java.util.List;

public class LargerThanFourNeighbors {
  public static void main(String[] args) {
    Dog[] dogs = new Dog[] {
        new Dog(60),
        new Dog(20),
        new Dog(30),
        new Dog(25),
        new Dog(20),
        new Dog(40),
        new Dog(10),
        new Dog(20),
        new Dog(10),
        new Dog(50),
        new Dog(30),

    };
    findTheLargerDogsWeights(dogs);
  }

  public static void findTheLargerDogsWeights(Dog[] dogs) {
    // maxDW用於盛放遍歷出來的最大dog weight。因為不確定有幾個，所以用ArrayList而非array
    List<Integer> maxDW = new ArrayList<>();
    for (int i = 0; i < dogs.length; i++) {
      int max = dogs[i].getDSize();
      for (int j = i - 2; j <= i + 2; j++) {
        if (j < 0) {
          continue;
        }
        if (j >= dogs.length) {
          break;
        }
        if (j == i) {
          continue;
        }
        if (max < dogs[j].getDSize()) {
          max = dogs[j].getDSize();
        }
      }
      maxDW.add(max);
    }

    // 去除重复的dogs的重量。List maxDW轉TreeSet（去重+排序）
    TreeSet<Integer> treeSetMaxDogWeights = new TreeSet<Integer>(maxDW);

    System.out.print(treeSetMaxDogWeights);
  }

}

class Dog {
  public int weightInPounds;

  public Dog(int w) {
    weightInPounds = w;
  }

  public int getDSize() {
    return weightInPounds;
  }
}