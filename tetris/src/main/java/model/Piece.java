package model;

public abstract class Piece {

    protected int rotationState;
    protected Block[] blocks = new Block[4];

    //Move commands
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

    //Rotate command
    public abstract void rotate();

    //Information and validation methods
    public int[][] getCurrentPosition(){
        int[][] currentPos = new int[4][2];
        int i = 0;
        for (Block b : blocks) {
            currentPos[i][0] = b.getXPos();
            currentPos[i][1] = b.getYPos();
            i++;
        }
        return currentPos;
    };
}
