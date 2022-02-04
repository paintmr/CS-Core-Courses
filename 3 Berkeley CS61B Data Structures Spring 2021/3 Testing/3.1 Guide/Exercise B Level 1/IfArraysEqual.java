import static org.junit.Assert.*;


public class IfArraysEqual {
    public static void ifArrEq(String[] stringArr1, String[] stringArr2) {
        assertArrayEquals(stringArr1, stringArr2);
    }

    public static void ifArrEq(int[] intArr1, int[] intArr2) {
        assertArrayEquals(intArr1, intArr2);
    }

    public static void ifArrEq(Object[] objArr1, Object[] objArr2) {
        assertArrayEquals(objArr1, objArr2);
    }
}
