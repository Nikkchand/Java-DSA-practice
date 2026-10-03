public class interfaces{
    public static void main(String[] args) {
        King k = new King();
        k.moves();

        Queen Q = new Queen();
        Q.moves();

        Rook R = new Rook();
        R.moves();

        Pawn P = new Pawn();
        P.moves();

        Knight K = new Knight();
        K.moves();

        Bishop B = new Bishop();
        B.moves();

        Bear B1 = new Bear();
        B1.herbivores();
        B1.carnivores();
    }
}

interface chessPlayer{
    void moves();   // interface only gives idea not implementation, that done in sub class of interface
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("King: up,down,left,right,diagonal - (in all directions with only one step)");
    }
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Queen: up,down,left,right,diagonal- (in all directions with many steps)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Rook: up,down,left,right - (in all directions with many step)");
    }
}

class Pawn implements chessPlayer{
    public void moves(){
        System.out.println("Pawn: up - (start for one or two step but then only on step) , diagonal -(to kill chessPiece)");
    }
}

class Knight implements chessPlayer{
    public void moves(){
        System.out.println("Knight: 2.5 moves - (anywhere)");
    }
}

class Bishop implements chessPlayer{
    public void moves(){
        System.out.println("Bishop: diagonal - (in all directions with many steps)");
    }
}

// Multiple Inheritance:--
interface herbivores{
    void herbivores();
}
interface carnivores{
    void carnivores();
}

class Bear implements herbivores,carnivores{
  public void herbivores(){
        System.out.print("Bear eats Plants");
    }
  public void carnivores(){
        System.out.println(" And also eats Meats");
    }
}