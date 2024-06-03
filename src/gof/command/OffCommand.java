package gof.command;

public class OffCommand implements Command{ // Command를 구현한 OffCommand
    private final Receiver receiver;

    public OffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
}