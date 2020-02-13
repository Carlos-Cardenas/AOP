import java.lang.Math;
import java.io.*;
import java.util.*;


public class KnightP extends Piece{
  public KnightP(){
    super("Knight","White",'C', 1);

  }
  public KnightP(String type, String color, char row, int column){
    super(type, color, row, column);
  }
    
  @Override 
  public boolean CheckMovement(int x, int y, int fx, int fy){
      fx = getRow();
      fy = getColumn();
       if((Math.abs(x-fx) == 1 && Math.abs(y-fy) == 2) ^ (Math.abs(x-fx) == 2 && Math.abs(y-fy) == 1 )){
        System.out.println("Valid move.");
        return true;
    }
    else{
        System.out.println("Invalid move.");
        return false;
    }
  }
}
    