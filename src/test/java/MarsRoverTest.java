import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverTest {

    @Test
    public void turn_left_rovers_when_l() {
        MarsRover marsRovers = new MarsRover();
        String position = marsRovers.execute("L");
        assertThat(position, is("0:0:W"));
    }

    @Test
    public void turn_right_rovers_when_r() {
        MarsRover marsRovers = new MarsRover();
        String position = marsRovers.execute("R");
        assertThat(position, is("0:0:E"));
    }

    @Test
    public void move_foward_rovers_when_m() {
        MarsRover marsRovers = new MarsRover();
        String position = marsRovers.execute("M");
        assertThat(position, is("1:0:N"));
    }

}
