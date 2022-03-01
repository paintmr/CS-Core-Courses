public class Dog implements Comparable<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    /**
     * Return negative if this dog is less than the dog printed by o, and so forth.
     */
    public int compareTo(Dog uddaDog) {
        // if (this.size < uddaDog.size) {
        // return -1;
        // } else if(this.size == uddaDog.size) {
        // return 0;
        // }
        // return 1;
        return this.size - uddaDog.size;
    }
}
