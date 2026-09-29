
abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playmusic() {
        System.out.println("playing music");
    }
}

// becomes abstract cause we dont implemented fly method
abstract class WagonR extends Car {

    // must override abstract method, otherwise it will give error
    @Override
    public void drive() {
        System.out.println("driving wagonR");
    }

    public void openSunroof() {
        System.out.println("opening sunroof");
    }
}

class updatedWagonR extends WagonR {

    // now we have to implement fly method
    @Override
    public void fly() {
        System.out.println("flying wagonR");
    }

}

public class Abstract {

    public static void main(String[] args) {

        Car car = new updatedWagonR();
        car.drive();
        car.fly();
        car.playmusic();

    }
}
