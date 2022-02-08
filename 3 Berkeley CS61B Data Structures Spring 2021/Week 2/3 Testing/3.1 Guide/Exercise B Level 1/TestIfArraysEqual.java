/**Write a testing method that will take in 2 arrays and see if they are equal.
 * These arrays can have nested arrays and those nested arrays can have nested arrays and so forth.*/


public class TestIfArraysEqual {
    public static void testStringArrEq () {
        String[] str1 = {"It", "is", "a", "sunny","day"};
        String[] str2 = {"It", "is", "a", "sunny","day"};
        IfArraysEqual.ifArrEq(str1, str2);
    }

    public static void testObjArrEq(){
        Dog[] dogs1 = new Dog[2];
        dogs1[0] = new Dog();
        dogs1[1] = new Dog();
        dogs1[2] = new Dog();

        Dog[] dogs2 = new Dog[2];
        dogs2[0] = new Dog();
        dogs2[1] = new Dog();
        dogs2[2] = new Dog();
        IfArraysEqual.ifArrEq(dogs1, dogs2);
    }

    public static void main(String[] args) {
//        testStringArrEq();
        testObjArrEq();
    }
}
