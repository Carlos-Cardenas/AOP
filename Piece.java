import java.lang.Math;

public class Piece {
  private String color;
  private char row;
  private int column;
  private String type;

  public Piece(){
    this.type = null;
  }
    
  public Piece(String type,String color, char x_move, int y_move){
    this.type = type;
    this.color = color;
    this.row = row;
    this.column = column;
  }
    
  public void setType(String type){
    this.type = type;
  }
    
  public void setColor(String color){
    this.color = color;
  }
    
  public void setRow(char row) {
    this.row = row;
  }
    
  public void setColumn(int column) {
    this.column = column;
  }

  public char getRow() {
    return this.row;
  }
    
  public int getColumn() {
    return this.column;
  }
    
  public String getColor(){
    return this.color;
  }

  public boolean CheckMovement(int x, int y, int fx, int fy){
    fx = getRow();
    fy = getColumn();
    boolean valid = true;
    if((fx < 'A')|(fy < 1) | (fx > 'H') | (fy > 8)){
        valid = false;
    }
    return valid;
  }
}