public class Car implements SelfDrivable, Movable, Markerinterface {
    // @Override
    // public void newMethod() {
    // // TODO Auto-generated method stub
    // SelfDrivable.super.newMethod();
    // }

    private int x, y, numberPerson;

    @Override
    public void destination(String s) {
        // TODO Auto-generated method stub
        System.out.println("Destination = " + s);
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Drive");

    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        y--;
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        x--;
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        x++;

    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        y++;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setnumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public int getnumberPerson() {
        return numberPerson;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Car(int x, int y, int numberPerson) {
        this.x = x;
        this.y = y;
        this.numberPerson = numberPerson;
    }

    public Car() {
    }

}
