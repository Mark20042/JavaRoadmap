
abstract class Bike {

    public abstract void drive();

    public abstract void fly();

    public void playmusic() {
        System.out.println("playing music");
    }
}

public class AnonymAbstract {

    public static void main(String[] args) {

        Bike bike = new Bike() {

            @Override
            public void drive() {
                System.out.println("driving bike");
            }

            @Override
            public void fly() {
                System.out.println("flying bike");
            }

        };

        bike.drive();
        bike.fly();
        bike.playmusic();

    }
}
