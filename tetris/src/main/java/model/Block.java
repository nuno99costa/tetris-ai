package model;

public class Block{

    int xPos;
    int yPos;

    public Block(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void move(int xSteps, int ySteps) {
        xPos += xSteps;
        yPos += ySteps;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }
}
