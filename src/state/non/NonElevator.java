package state.non;

public class NonElevator {
    public static final String up = "UP";
    public static final String down = "DOWN";
    public static final String stop = "STOP";
    private String curState = "";

    public NonElevator() {
        this.curState = stop;
    }

    public void setState(String state) {
        this.curState = state;
    }

    public void pushUpButton() {
        if (curState.equals(up)) {
            System.out.println("동작 없음");
        } else {
            System.out.println("올라감");
            curState = up;
        }
    }

    public void pushDownButton() {
        if (curState.equals(down)) {
            System.out.println("동작 없음");
        } else {
            System.out.println("내려감");
            curState = down;
        }
    }

    public void pushStopButton() {
        if (curState.equals(stop)) {
            System.out.println("동작 없음");
        } else {
            System.out.println("멈춤");
            curState = stop;
        }
    }
}
