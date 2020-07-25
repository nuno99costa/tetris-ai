package model.pieces;

import model.Block;
import model.Piece;

public class TPiece extends Piece {
    public TPiece() {
        rotationState = 0;
        blocks[0] = new Block(4,20);
        blocks[1] = new Block(3,19);
        blocks[2] = new Block(4,19);
        blocks[3] = new Block(5,19);
    }

    @Override
    public void rotate() {
        switch (rotationState){
            case 0:
                blocks[0].move(1,-1);
                blocks[1].move(1,1);
                blocks[3].move(-1,-1);
                rotationState++;
                break;
            case 1:
                blocks[0].move(-1,-1);
                blocks[1].move(1,-1);
                blocks[3].move(-1,1);
                rotationState++;
                break;
            case 2:
                blocks[0].move(-1,1);
                blocks[1].move(-1,-1);
                blocks[3].move(1,1);
                rotationState++;
                break;
            case 3:
                blocks[0].move(1,1);
                blocks[1].move(-1,1);
                blocks[3].move(1,-1);
                rotationState = 0;
                break;
        }
    }
}