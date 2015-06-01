package chess;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.*;

/**
 * This unit test exercises the Bishop class
 */
public class BishopTest {

    private Bishop bishop;
    private static final Map<String, String> testPositions = new HashMap<String, String>();
    
    @Before
    public void setUp() {
        bishop = new Bishop();
        //add a middle position
        testPositions.put("d4", "@1a,@2b,@3c,@5e,@6f,@7g,@8h,@7a,@6b,@5c,@3e,@2f,@1g");
        //add corners
        testPositions.put("a1", "@2b,@3c,@4d,@5e,@6f,@7g,@8h");
        testPositions.put("a8", "@7b,@6c,@5d,@4e,@3f,@2g,@1h");
        testPositions.put("h1", "@8a,@7b,@6c,@5d,@4e,@3f,@2g");
        testPositions.put("h8", "@1a,@2b,@3c,@4d,@5e,@6f,@7g");
        //add a pos on the edge
        testPositions.put("e1", "@2f,@3g,@4h,@2d,@3c,@4b,@5a");
        testPositions.put("a3", "@2b,@1c,@4b,@5c,@6d,@7e,@8f");
        testPositions.put("f8", "@7g,@6h,@7e,@6d,@5c,@4b,@3a");
        testPositions.put("h4", "@3g,@2f,@1e,@5g,@6f,@7e,@8d");
    }

    /**
     * Test whether we get not null results for this position
     */
    @Test
    public void testNextPositionsNotNull() throws Exception {
        for (String pos : testPositions.keySet()) {
            Position position = new Position(pos);
            assertNotNull("The set of next positions for " + position + " can never be null",
                    bishop.getNextPositions(position));
        }
    }

    /**
     * Test whether positions returned match with expected positions
     * @throws Exception
     */
    @Test
    public void testValuesNextPosition() throws Exception {
        for (String pos : testPositions.keySet()) {
            Position position = new Position(pos);
            Set<String> expectedPositions = computeExpectedPositions(testPositions.get(pos));
            Set<Position> nextPos = bishop.getNextPositions(position);
            assertEquals("Checking expected position size for " + pos, expectedPositions.size(), nextPos.size());
            for (Position p : nextPos) {
                assertTrue("Checking whether a given pos: " + p.toString() + " exist in result for start pos: " + pos,
                        expectedPositions.contains(p.toString()));
            }
        }
    }

    /**
     * A helper function which converted a string of comma separated position strings to a set of strings
     * @param expectedPosString: A string of comma separated position strings. example: "a2,b3,c4"
     * @return expectedPosSet: A set of strings
     */
    private Set<String> computeExpectedPositions(String expectedPosString) {
        Set<String> retval = new LinkedHashSet<String>();
        retval.addAll(Arrays.asList(expectedPosString.split(",")));
        return retval;
    }

}
