package OOPS;

public class Interface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
        q1.chl();

        Kutta h = new Kutta();
        h.eats();
        h.zindaeats();
    }
}
interface carnivore{
    void eats();
}
interface herbivore{
    void zindaeats();
}

class Kutta implements carnivore,herbivore{
    public void eats(){
        System.out.println("hara bhara khaunga");
    }
    public void zindaeats(){
        System.out.println("pdh ky rha hai tujhe bhi kha lunga");
    }
}
 

interface chessPlayer{
    void moves();
}
interface chomuPalyer{
    void chl();
}

class Queen implements chessPlayer,chomuPalyer{
    public void moves(){
        System.out.println("Left ,Right ,Up , Down, Diagonal in all directions");
    }
    public void chl(){
        System.out.println("nhi chlna");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Left ,Right ,Up , Down");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("Left ,Right ,Up , Down, Diagonal in all directions(By one step)");
    }
}