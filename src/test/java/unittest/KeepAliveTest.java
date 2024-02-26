package unittest;

import static in.testonics.omni.models.KeepAlive.keepAliveByMouseMove;
import org.junit.Test;

public class KeepAliveTest {

    @Test
    public void main() throws Exception {
        keepAliveByMouseMove(10);
    }
}
