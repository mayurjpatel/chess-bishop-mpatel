package chess;

/**
 * This class defines a position on a chess board
 */
public class Position {
    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;
    public static final char MIN_COLUMN = 'a';
    public static final char MAX_COLUMN = 'h';

    private char column;
    private int row;

    public Position(char column, int row) {
        if (column < MIN_COLUMN || column > MAX_COLUMN) {
            throw new IllegalArgumentException("Bad Column: " + column);
        }

        if (row < MIN_ROW || row > MAX_ROW) {
            throw new IllegalArgumentException("Bad Row: " + row);
        }

        this.column = column;
        this.row = row;
    }

    public Position(String colrow) {
        this(colrow.charAt(0), Character.digit(colrow.charAt(1), 10));
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "@" + getRow() + getColumn();
    }
}
