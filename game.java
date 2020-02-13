import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;



public class game{
  public static void main(String args[]) throws FileNotFoundException { //Exception if there is no file
    System.out.println("Let's play chess!");
    System.out.println("Enter true to play or false to exit");
    Scanner scanner = new Scanner(System.in); 
    boolean answer = scanner.nextBoolean(); //boolean value to help while loop
    if(!answer){
      System.out.println("See you later...");
      System.exit(0);
    }
    File text = new File("pieces.txt"); //file to be used
    Scanner scanFile = new Scanner(text);

    System.out.println("Which row do you want to move to?");
    char row = scanner.next().charAt(0); //input the position in x
    row = Character.toLowerCase(row);
    if(row <'a' || row >'h'){
      System.out.println("That row is not available");
    }
      
    int rowN = 0; // variable to change letter to number
    if(row == 'a'){
        rowN = 1;
    }
    else if(row == 'b'){
        rowN = 2;
    }
    else if(row == 'c'){
        rowN = 3;
    }
    else if(row == 'd'){
        rowN = 4;
    }
    else if(row == 'e'){
        rowN = 5;
    }
    else if(row == 'f'){
        rowN = 6;
    }
    else if(row == 'g'){
        rowN = 7;
    }
    else if(row == 'h'){
        rowN = 8;
    }  
      
    System.out.println("In which column do you want to start?");
    String y = scanner.next();// input the position in y
    int column = Integer.parseInt(y); //converts y to an integer
      
    System.out.println(rowN);
    System.out.println(column);


    while(scanFile.hasNextLine()){
      String line = scanFile.nextLine();
      String[] words = line.split(", ");
      String pieces = words[0].substring(0, words[0].length()-2);
    int rowN2 = 0; // variable to change letter to number
    if(words[2] == "a"){
        rowN2 = 1;
    }
    else if(words[2] == "b"){
        rowN2 = 2;
    }
    else if(words[2] == "c"){
        rowN2 = 3;
    }
    else if(words[2] == "d"){
        rowN2 = 4;
    }
    else if(words[2] == "e"){
        rowN2= 5;
    }
    else if(words[2] == "f"){
        rowN2 = 6;
    }
    else if(words[2] == "g"){
        rowN2 = 7;
    }
    else if(words[2] == "h"){
        rowN2 = 8;
    }        
    
      switch(pieces){
        case "Pawn":
        PawnP pawn = new PawnP(words[0],words[1],words[2].charAt(0),Integer.parseInt(words[3]));
        System.out.println("------------------------------");
        System.out.print(words[0] +" is ");
        pawn.CheckMovement(rowN2,Integer.parseInt(words[3]),rowN, column);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Knight":
        KnightP knight = new KnightP(words[0], words[1], words[2].charAt(0),Integer.parseInt(words[3]));
        System.out.println("------------------------------");
        System.out.print(words[0] +" is ");
        knight.CheckMovement(rowN2,Integer.parseInt(words[3]),rowN, column);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Bishop":
        BishopP bishop = new BishopP(words[0], words[1], words[2].charAt(0),Integer.parseInt(words[3]));
        System.out.println("------------------------------");
        System.out.print(words[0] +" is ");
        bishop.CheckMovement(rowN2,Integer.parseInt(words[3]),rowN, column);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Rook":
        RookP rook = new RookP(words[0], words[1], words[2].charAt(0),Integer.parseInt(words[3]));
        System.out.println("------------------------------");
        System.out.print(words[0] +" is ");
        rook.CheckMovement(rowN2,Integer.parseInt(words[3]),rowN, column);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "King":
        KingP king = new KingP(words[0], words[1], words[2].charAt(0), Integer.parseInt(words[3]));
        System.out.println("------------------------------");
        System.out.print(words[0] +" is ");
        king.CheckMovement(rowN2,Integer.parseInt(words[3]),rowN, column);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        case "Queen":
        QueenP queen = new QueenP(words[0], words[1], words[2].charAt(0), Integer.parseInt(words[3]));
        System.out.println("------------------------------");
        System.out.print(words[0] +" is ");
        queen.CheckMovement(rowN2,Integer.parseInt(words[3]),rowN, column);
        System.out.println("------------------------------");
        System.out.println("");
        break;
        default:
        System.out.println("");
        System.out.println("The piece was not readable.");
        System.out.println("");
        break;
      }//switch
    }//while
  }//main done
}//class done