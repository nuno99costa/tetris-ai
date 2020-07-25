package model.pieces;

import model.Block;
import model.Piece;

public class IPiece implements Piece {

    int rotationState = 0;

    public IPiece() {
        blocks[0] = new Block(20,3);
        blocks[1] = new Block(20,4);
        blocks[2] = new Block(20,5);
        blocks[3] = new Block(20,6);
    }

    public void moveLeft() {
        blocks[0].move(-1,0);
        blocks[1].move(-1,0);
        blocks[2].move(-1,0);
        blocks[3].move(-1,0);
    }

    public void moveRight() {
        blocks[0].move(1,0);
        blocks[1].move(1,0);
        blocks[2].move(1,0);
        blocks[3].move(1,0);
    }

    public void moveDown() {
        blocks[0].move(0,-1);
        blocks[1].move(0,-1);
        blocks[2].move(0,-1);
        blocks[3].move(0,-1);
    }

    public void rotate() {
        switch (rotationState){
            case 0:
                blocks[0].move(1,2);
                blocks[1].move(0,1);
                blocks[2].move(-1,0);
                blocks[3].move(-2,-1);
                rotationState++;
                break;
            case 1:
                blocks[0].move(1,-2);
                blocks[1].move(0,-1);
                blocks[2].move(-1,0);
                blocks[3].move(-2,1);
                rotationState++;
                break;
            case 2:
                blocks[0].move(-2,-1);
                blocks[1].move(-1,0);
                blocks[2].move(0,1);
                blocks[3].move(1,2);
                rotationState++;
                break;
            case 3:
                blocks[0].move(-1,2);
                blocks[1].move(0,1);
                blocks[2].move(1,0);
                blocks[3].move(2,-1);
                rotationState = 0;
                break;
        }
    }

    public int[][] getCurrentPosition(){
        int currentPos[][] = new int[4][2];
        int i = 0;
        for (Block b : blocks) {
            currentPos[i][0] = b.getXPos();
            currentPos[i][1] = b.getYPos();
            i++;
        }
        return currentPos;
    }
}
