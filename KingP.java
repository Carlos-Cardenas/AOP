import java.lang.Math;
import java.io.*;
import java.util.*;


public class KingP extends Piece{
  public KingP(){
    super("Bishop","White",'E', 1);

  }
  public KingP(String type, String color, char row, int column){
    super(type, color, row, column);
  }
    
  @Override 
  public boolean CheckMovement(int x, int y, int fx, int fy){
      fx = getRow();
      fy = getColumn();
       if(Math.abs(x-fx) <= 1 && Math.abs(y-fy) <= 1 || Math.abs(fx-x)== Math.abs(fy-y) && Math.abs(x-fx) <= 1 && Math.abs(y-fy) <= 1){
        System.out.println("Valid move.");
        return true;
    }
    else{
        System.out.println("Invalid move.");
        return false;
    }
  }
}
    