package gof.command;

public class OnCommand implements Command{ // Command 구현
    private final Receiver receiver;

    public OnCommand(Receiver receiver) { // Receover를 파라미터로 받음, 하나일 수도, 여러 개 있을 수도 있음
        this.receiver = receiver;

    }

    @Override
    public void execute() {
        receiver.turnOn(); // receiver의 turnOn() -> 동작하는 방법이 달라도 똑같은 커맨드로 실행할 수 있음
    }
}
