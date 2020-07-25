package model;

public interface Piece {

    Block[] blocks = new Block[4];

    //Move commands
    public void moveLeft();
    public void moveRight();
    public void moveDown();

    //Rotate command
    public void rotate();

    //Information and validation methods
    public int[][] getCurrentPosition();
}
