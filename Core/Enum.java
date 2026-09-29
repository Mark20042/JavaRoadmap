
enum Status {
    FAILED, RUNNING, PENDING, SUCCESS, PAUSED
}

public class Enum {

    public static void main(String[] args) {

        Status status = Status.RUNNING;
        System.out.println(status);
        System.out.println(status.ordinal());

        for (Status s : Status.values()) {
            System.out.println(s);
        }

        status = Status.FAILED;

        switch (status) {
            case RUNNING:
                System.out.println("Running");
                break;
            case PENDING:
                System.out.println("Pending");
                break;
            case SUCCESS:
                System.out.println("Success");
                break;
            case FAILED:
                System.out.println("Failed");
                break;
            case PAUSED:
                System.out.println("Paused");
                break;
        }

    }
}
