public interface SelfDrivable {

    public void destination(String s);

    public void drive();

    default void newMethod() {
        print();
    }

    private void print() {
        System.out.println("New Method");

    }

    public interface InnerSelfDrivable {
        void msg();

    }
}
