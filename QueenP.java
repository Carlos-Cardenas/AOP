import java.lang.Math;
import java.io.*;
import java.util.*;


public class QueenP extends Piece{
  public QueenP(){
    super("Queen","White",'D', 1);

  }
  public QueenP(String type, String color, char row, int column){
    super(type, color, row, column);
  }
    
  @Override 
  public boolean CheckMovement(int x, int y, int fx, int fy){
      fx = getRow();
      fy = getColumn();
       if(Math.abs(fx-x) == Math.abs(fy-y) || (fy == y) && (x != fx) || (fx == x) && (y != fy)){
        System.out.println("Valid move.");
        return true;
    }
    else{
        System.out.println("Invalid move.");
        return false;
    }
  }
}
    