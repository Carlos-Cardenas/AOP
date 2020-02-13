import java.lang.Math;
import java.io.*;
import java.util.*;


public class PawnP extends Piece{
  public PawnP(){
    super("Pawn","White",'A', 2);

  }
  public PawnP(String type, String color, char row, int column){
    super(type, color, row, column);
  }
    
  @Override 
  public boolean CheckMovement(int x, int y, int fx, int fy){
      fx = getRow();
      fy = getColumn();
       if(this.getColor().equals("white")){
            if((x == fx) && ((y-fy)==1) || (fy == 2) && (y-fy == 2)){
                System.out.println("Valid move.");
                return true;
            }
        }
        else if(this.getColor().equals("black")){
            if((x == fx) && ((y-fy)==1) || (fy == 7) && (y-fy == 2) && (x == fx)){
                System.out.println("Valid move.");
                return true;
            }
        }
        System.out.println("Invalid move.");
        return false;  
    }
  }
