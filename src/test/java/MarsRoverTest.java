import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverTest {


    private MarsRover marsRovers;

    @BeforeEach
    void setUp() {
        marsRovers = new MarsRover();
    }

    @Test
    public void given_initial_position_when_L_then_turn_left_rovers() {
        String position = marsRovers.execute("L");
        assertThat(position, is("0:0:W"));
    }

    @Test
    public void given_initial_position_when_R_turn_right_rovers() {
        String position = marsRovers.execute("R");
        assertThat(position, is("0:0:E"));
    }

    @ParameterizedTest
    @CsvSource({"M,   1:0:N",
                "MM,  2:0:N",
                "MMM, 3:0:N",
                "MMMMMMMMMMM, 0:0:N"})
    public void given_initial_position_when_M_move_foward_rovers(String command, String expected) {
        String position = marsRovers.execute(command);
        assertThat(position, is(expected));
    }

}
