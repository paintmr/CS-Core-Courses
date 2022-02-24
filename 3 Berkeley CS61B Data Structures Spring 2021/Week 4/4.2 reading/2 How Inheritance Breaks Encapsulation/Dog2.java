public class Dog2 {
    public void bark() {
        barkMany(1);
    }

    public void barkMany(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("bark");
        }
    }
}