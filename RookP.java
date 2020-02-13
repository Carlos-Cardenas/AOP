import java.lang.Math;
import java.io.*;
import java.util.*;


public class RookP extends Piece{
  public RookP(){
    super("Rook","White",'A', 1);

  }
  public RookP(String type, String color, char row, int column){
    super(type, color, row, column);
  }
    
  @Override 
  public boolean CheckMovement(int x, int y, int fx, int fy){
      fx = getRow();
      fy = getColumn();
       if((fy == y) && (x != fx) || (fx == x) && (y != fy)){
        System.out.println("Valid move.");
        return true;
    }
    else{
        System.out.println("Invalid move.");
        return false;
    }
  }
}
    