package model.pieces;

import model.Block;
import model.Piece;

public class OPiece extends Piece {

    public OPiece() {
        rotationState = 0;
        blocks[0] = new Block(4,20);
        blocks[1] = new Block(5,20);
        blocks[2] = new Block(4,19);
        blocks[3] = new Block(5,19);
    }

    //this piece doesn't rotate
    public void rotate() {

    }
}
