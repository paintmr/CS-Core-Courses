public class Dog1 {
    public void bark() {
        System.out.print("bark");
    }

    public void barkMany(int N){
        for (int i = 0; i < N; i++) {
            bark();
        }
    }
}