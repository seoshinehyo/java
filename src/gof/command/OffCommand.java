package gof.command;

public class OffCommand implements Command{
    private final Receiver receiver;

    public OffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
}
