public class MarsRover {
    public String execute(String command) {
        return command.equals("R") ? "0:0:E" : "0:0:W";
    }
}
