import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverTest {

    @Test
    public void given_initial_position_when_L_then_turn_left_rovers() {
        MarsRover marsRovers = new MarsRover();
        String position = marsRovers.execute("L");
        assertThat(position, is("0:0:W"));
    }

    @Test
    public void given_initial_position_when_R_turn_right_rovers() {
        MarsRover marsRovers = new MarsRover();
        String position = marsRovers.execute("R");
        assertThat(position, is("0:0:E"));
    }

    @Test
    public void given_initial_position_when_M_move_foward_rovers() {
        MarsRover marsRovers = new MarsRover();
        String position = marsRovers.execute("M");
        assertThat(position, is("1:0:N"));
    }

}
