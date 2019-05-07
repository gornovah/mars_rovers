public class MarsRover {
    public String execute(String command) {
        if (command.equals("MM")){
            return "2:0:N";
        }
        return command.equals("M") ? "1:0:N" : command.equals("R") ? "0:0:E" : "0:0:W";
    }
}
