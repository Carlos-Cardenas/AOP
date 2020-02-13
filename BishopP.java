import java.lang.Math;
import java.io.*;
import java.util.*;


public class BishopP extends Piece{
  public BishopP(){
    super("Bishop","White",'B', 1);

  }
  public BishopP(String type, String color, char row, int column){
    super(type, color, row, column);
  }
    
  @Override 
  public boolean CheckMovement(int x, int y, int fx, int fy){
      fx = getRow();
      fy = getColumn();
      if(Math.abs(x-fx) == Math.abs(y-fy)){
        System.out.println("a valid move.");
        return true;
    }
    else{
        System.out.println("an invalid move.");
        return false;
    }
  }
}
    