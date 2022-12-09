package game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    //GLOBALS 
    
    //these hold the positions (ID) of each of the shapes and their pair.
    //this ID is handed out from initShuffleTiles() randomCollection array.
    int BRect1, BRect2;
    int Circle1, Circle2;
    int Doodle1, Doodle2;
    int Dice1 , Dice2;
    int HalfPipe1, HalfPipe2;
    int Metroid1, Metroid2;
    int VerticaCrosshair1, VerticaCrosshair2;
    int WElevator1, WElevator2;
    int Blink1, Blink2;
    int Crosshair1, Crosshair2;
    int Diagonal1, Diagonal2;
    int Halo1, Halo2;
    int Horizontal1, Horizontal2;
    int Lambda1, Lambda2;
    int Plankton1, Plankton2;
    int Portal1, Portal2;
    int BElevator1, BElevator2;
    int Smiley1, Smiley2;
    
    //========================================================================================
    //          4Smiley4 GAME BOARD TILE CONTROL
    //========================================================================================
    
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle4x4Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        //assign each shape their locations
        BRect1 = randomCollection.get(n);
        n++;
        BRect2 = randomCollection.get(n);
        n++;
        Circle1 = randomCollection.get(n);
        n++;       
        Circle2 = randomCollection.get(n);
        n++   ;   
        Doodle1 = randomCollection.get(n);
        n++;
        Doodle2 = randomCollection.get(n);
        n++; 
        HalfPipe1 = randomCollection.get(n);
        n++;
        HalfPipe2 = randomCollection.get(n);
        n++;
        Metroid1 = randomCollection.get(n);
        n++;
        Metroid2 = randomCollection.get(n);
        n++; 
        Lambda1 = randomCollection.get(n);
        n++;
        Lambda2 = randomCollection.get(n);
        n++;
        Plankton1 = randomCollection.get(n);
        n++;
        Plankton2 = randomCollection.get(n);
        n++;
        Smiley1 = randomCollection.get(n);
        n++;
        Smiley2 = randomCollection.get(n);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get4x4TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == BRect1 || ID == BRect2){
            type = 0;
            System.out.print(type + " - BRect");
        }
        else if (ID == Circle1 || ID == Circle2){
            type = 1;
            System.out.print(type + " - Circle");
        }
        else if (ID == Doodle1 || ID == Doodle2){
            type = 2;
            System.out.print(type + " - Doodle");
        }
        else if (ID == HalfPipe1 || ID == HalfPipe2){
            type = 3;
            System.out.print(type + " - HalfPipe");
        }
        else if (ID == Metroid1 || ID == Metroid2){
            type = 4;
            System.out.print(type + " - Metroid");
        }
        else if (ID == Lambda1 || ID == Lambda2){
            type = 5;
            System.out.print(type + " - Lambda");      
        }
        else if (ID == Plankton1 || ID == Plankton2){
            type = 6;
            System.out.print(type + " - Plankton");
        }
        else if (ID == Smiley1 || ID == Smiley2){
            type = 7;
            System.out.print(type + " - Smiley");
        }
        System.out.println();
        
        return type;
    }
    //========================================================================================
    //          6x6 GAME BOARD TILE CONTROL
    //========================================================================================
   
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle6x6Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 35 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 35; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        BRect1 = randomCollection.get(n);
        n++;
        BRect2 = randomCollection.get(n);
        n++;
        Circle1 = randomCollection.get(n);
        n++;       
        Circle2 = randomCollection.get(n);
        n++   ;   
        Doodle1 = randomCollection.get(n);
        n++;
        Doodle2 = randomCollection.get(n);
        n++;
        Dice1 = randomCollection.get(n);
        n++;
        Dice2 = randomCollection.get(n);
        n++;
        HalfPipe1 = randomCollection.get(n);
        n++;
        HalfPipe2 = randomCollection.get(n);
        n++;
        Metroid1 = randomCollection.get(n);
        n++;
        Metroid2 = randomCollection.get(n);
        n++;
        VerticaCrosshair1 = randomCollection.get(n);
        n++;
        VerticaCrosshair2 = randomCollection.get(n);
        n++;
        WElevator1 = randomCollection.get(n);
        n++;
        WElevator2 = randomCollection.get(n);
        n++;
        Blink1 = randomCollection.get(n);
        n++;
        Blink2 = randomCollection.get(n);
        n++;
        Crosshair1 = randomCollection.get(n);
        n++;
        Crosshair2 = randomCollection.get(n);
        n++;
        Diagonal1 = randomCollection.get(n);
        n++;
        Diagonal2 = randomCollection.get(n);
        n++;
        Halo1 = randomCollection.get(n);
        n++;
        Halo2 = randomCollection.get(n);
        n++;
        Horizontal1 = randomCollection.get(n);
        n++;
        Horizontal2 = randomCollection.get(n);
        n++;
        Lambda1 = randomCollection.get(n);
        n++;
        Lambda2 = randomCollection.get(n);
        n++;
        Plankton1 = randomCollection.get(n);
        n++;
        Plankton2 = randomCollection.get(n);
        n++;
        Portal1 = randomCollection.get(n);
        n++;
        Portal2 = randomCollection.get(n);
        n++;
        BElevator1 = randomCollection.get(n);
        n++;
        BElevator2 = randomCollection.get(n);
        n++;
        Smiley1 = randomCollection.get(n);
        n++;
        Smiley2 = randomCollection.get(n);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get6x6TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == BRect1 || ID == BRect2){
            type = 0;
            System.out.print(type + " - BRect");
        }
        else if (ID == Circle1 || ID == Circle2){
            type = 1;
            System.out.print(type + " - Circle");
        }
        else if (ID == Doodle1 || ID == Doodle2){
            type = 2;
            System.out.print(type + " - Doodle");
        }
        else if (ID == Dice1 || ID == Dice2){
            type = 3;
            System.out.print(type + " - Dice");
        }
        else if (ID == HalfPipe1 || ID == HalfPipe2){
            type = 4;
            System.out.print(type + " - HalfPipe");
        }
        else if (ID == Metroid1 || ID == Metroid2){
            type = 5;
            System.out.print(type + " - Metroid");
        }
        else if (ID == VerticaCrosshair1 || ID == VerticaCrosshair2){
            type = 6;
            System.out.print(type + " - Vertical");
        }
        else if (ID == WElevator1 || ID == WElevator2){
            type = 7;
            System.out.print(type + " - WElevator");
        }
        else if (ID == Blink1 || ID == Blink2){
            type = 8;
            System.out.print(type + " - Blink");
        }
        else if (ID == Crosshair1 || ID == Crosshair2){
            type = 9;
            System.out.print(type + " - Crosshair");
        }
        else if (ID == Diagonal1 || ID == Diagonal2){
            type = 10;
            System.out.print(type + " - Diagonal");
        }
        else if (ID == Halo1 || ID == Halo2){
            type = 11;
            System.out.print(type + " - Halo");
        }
        else if (ID == Horizontal1 || ID == Horizontal2){
            type = 12;
            System.out.print(type + " - LambdaHalfPipe");
        }
        else if (ID == Lambda1 || ID == Lambda2){
            type = 13;
            System.out.print(type + " - Lambda");      
        }
        else if (ID == Plankton1 || ID == Plankton2){
            type = 14;
            System.out.print(type + " - Plankton");
        }
        else if (ID == Portal1 || ID == Portal2){
            type = 15;
            System.out.print(type + " - Portal");
        }
        else if (ID == BElevator1 || ID == BElevator2){
            type = 16;
            System.out.print(type + " - BElevator");
        }       
        else if (ID == Smiley1 || ID == Smiley2){
            type = 17;
            System.out.print(type + " - Smiley");
        }
        System.out.println();
        
        return type;
    }
}
