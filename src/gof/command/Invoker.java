package gof.command;

public class Invoker { // optional함, 하나의 커맨드를 여러 개를 조합하거나, 명령을 수행했다가 취소시키는 이런걸 관리(컨트롤러 역할)
    Command onCmd;
    Command offCmd;

    public void setCommand(Command onCmd, Command offCmd) {
        // 명령어들을 스택형식으로 구현하는 것도 가능.
        this.onCmd = onCmd;
        this.offCmd = offCmd;
    }

    void on() {
        this.onCmd.execute(); // 인보커에 어떤 액션이 요청 되었을때 특정 커맨드가 실행 -> 조합해서 여러 가지 방법으로 운영 가능
        //this.offCmd.execute();
    }

    void off() {
        this.offCmd.execute();
    }
}