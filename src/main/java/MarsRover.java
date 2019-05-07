public class MarsRover {
    public String execute(String command) {
        String result = moveForward(command);
        if (command.equals("R")) {
            result = "0:0:E";
        } else if (command.equals("L")) {
            result = "0:0:W";
        }
        return result;
    }

    private String moveForward(String command) {
        long count = command.chars().filter(ch -> ch == 'M').count();
        int x = 0;
        String result = ":0:N";
        if (count == 11) {
            return "0:0:N";
        } else if (count > 1 || count > 11) {
            x += count;
            return x + result;
        } else {
            return "1:0:N";
        }
    }
}
