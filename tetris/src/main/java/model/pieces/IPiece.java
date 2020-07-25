package model.pieces;

import model.Block;
import model.Piece;

public class IPiece extends Piece {

    public IPiece() {
        rotationState = 0;
        blocks[0] = new Block(3,20);
        blocks[1] = new Block(4,20);
        blocks[2] = new Block(5,20);
        blocks[3] = new Block(6,20);
    }

    @Override
    public void rotate() {
        switch (rotationState){
            case 0:
                blocks[0].move(2,1);
                blocks[1].move(1,0);
                blocks[2].move(0,-1);
                blocks[3].move(-1,-2);
                rotationState++;
                break;
            case 1:
                blocks[0].move(-2,1);
                blocks[1].move(-1,0);
                blocks[2].move(0,-1);
                blocks[3].move(1,-2);
                rotationState++;
                break;
            case 2:
                blocks[0].move(-1,-2);
                blocks[1].move(0,-1);
                blocks[2].move(1,0);
                blocks[3].move(2,1);
                rotationState++;
                break;
            case 3:
                blocks[0].move(2,-1);
                blocks[1].move(1,0);
                blocks[2].move(0,1);
                blocks[3].move(-1,2);
                rotationState = 0;
                break;
        }
    }
}
