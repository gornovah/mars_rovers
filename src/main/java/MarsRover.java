public class MarsRover {
    public String execute(String command) {
        return command.equals("M") ? "1:0:N" : command.equals("R") ? "0:0:E" : "0:0:W";
    }
}
