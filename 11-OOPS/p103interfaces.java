public class p103interfaces {
    public static void main(String[] args) {
        queen q1=new queen();
        q1.moves();
    }
}

interface chessplayer{
    void moves();
}

class queen implements chessplayer{
  public  void moves(){
        System.out.println("Up,down,left,right,diagonal");
    }
}


class Rook implements chessplayer{
    public  void moves(){
          System.out.println("up,down,left,right");
      }
  }
  
  class King implements chessplayer{
    public  void moves(){
          System.out.println("up,down,left,right,diagonal by (one step)");
      }
  }
  
