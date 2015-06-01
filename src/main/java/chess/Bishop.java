package chess;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a basic description of a Bishop chess piece.
 */
public class Bishop {

    /**
     * This method should retrieve the possible positions of a piece on a chess board.
     */
    public Set<Position> getNextPositions(Position origin) {
        Set<Position> retVal = new HashSet<Position>();
        int curRow = origin.getRow();
        int curCol = (int)(origin.getColumn());
        int maxColInt = (int)(Position.MAX_COLUMN);
        int minColInt = (int)(Position.MIN_COLUMN);

        // if cur row = 4, cur col = d aka 100
        for (int i = curRow+1, j=curCol+1; i <= Position.MAX_ROW && j <= maxColInt; i++, j++) {
            // i = { 5, 6, 7, 8 }
            // j = { e, f, g, h }
            // pos = { e5, f6, g7, h8 }
            retVal.add(new Position((char) j, i));
        }
        for (int i = curRow+1, j=curCol-1; i <= Position.MAX_ROW && j >= minColInt; i++, j--) {
            // i = { 5, 6, 7, 8 }
            // j = { c, b, a}
            // pos = { c5, b6, a7 }
            retVal.add(new Position((char) j, i));
        }
        for (int i = curRow-1, j=curCol+1; i >= Position.MIN_ROW && j <= maxColInt; i--, j++) {
            // i = { 1, 2, 3 }
            // j = { e, f, g, h }
            // pos = { e1, f2, g3 }
            retVal.add(new Position((char) j, i));
        }
        for (int i = curRow-1, j=curCol-1; i >= Position.MIN_ROW && j >= minColInt; i--, j--) {
            // i = { 1, 2, 3 }
            // j = { a, b, c }
            // pos = { a1, b2, c3 }
            retVal.add(new Position((char) j, i));
        }
        return retVal;
    }
}
