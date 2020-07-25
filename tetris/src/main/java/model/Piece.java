package model;

public interface Piece {

    //Move commands
    public boolean moveLeft();
    public boolean moveRight();
    public boolean moveDown();

    //Rotate command
    public boolean rotate();

}
