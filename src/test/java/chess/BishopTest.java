package chess;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * This unit test exercises the Bishop class
 */
public class BishopTest {

    private Bishop bishop;
    private Position start;

    @Before
    public void setUp() {
        bishop = new Bishop();
        start = new Position("d4");
    }

    @Test
    public void testNextPositionsNotNull() throws Exception {
        assertNotNull("The set of next positions can never be null", bishop.getNextPositions(start));
    }

}
