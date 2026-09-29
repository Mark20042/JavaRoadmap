
interface Computer {

    void code();
}

class LapTop implements Computer {

    @Override
    public void code() {
        System.out.println("coding in lap");
    }

}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("coding in desktop");
    }
}

class Developer {

    public void devapp(Computer com) {
        com.code();
    }
}

public class NeedInterface {

    public static void main(String[] args) {

        LapTop lap = new LapTop();
        Desktop desktop = new Desktop();
        Developer azore = new Developer();

        azore.devapp(lap);
        azore.devapp(desktop);

    }

}
