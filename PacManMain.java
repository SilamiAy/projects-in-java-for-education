 package Silami;

public class PacManMain {
    public static void main (String[]args){
        PacMan Q = new PacMan();
        Q.x = 3;
        Q.y = 5;
        Q.width = 5;
        Q.height = 5;
        
        Q.moveLeft();
        Q.printPosition();
        Q.moveRight();
        Q.printPosition();
        Q.moveUp();
        Q.printPosition();
        Q.moveDown();
        Q.printPosition();
    }
}
