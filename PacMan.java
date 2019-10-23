package Silami;

public class PacMan {
    int x, y;
    int width, height;
    
    void moveLeft(){
        if(x>0)
        x = x - 1;
    }
    void moveRight(){
        if(x<width)
        x = x + 1;
    }
    void moveUp (){
        if(y>0)
        y = y - 1;
    }
    void moveDown(){
        if(y<height)
        y = y + 1;
    }
    void printPosition(){
        System.out.println("PacMan is in the position "+ x +" and " + y );
    }
}
