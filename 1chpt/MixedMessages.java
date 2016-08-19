class MixedMessages {
  public static void main (String [] args){
    int x = 0;
    int y = 0;
    while (x < 5 ){
      y = x - y;
    
    System.out.println(x + " " + y +" ");
    x = x + 1;
    }
  }
}

/*

0 0 
1 1 
2 1 
3 2 
4 2 

*/

class Main {
  public static void main (String [] args){
    int x = 0;
    int y = 0;
    while (x < 5 ){
      y = x + y;
    
    System.out.println(x + " " + y +" ");
    x = x + 1;
    }
  }
}



/*
0 0 
1 1 
2 3 
3 6 
4 10 

*/


class Main {
  public static void main (String [] args){
    int x = 0;
    int y = 0;
    while (x < 5 ){
    y = y + 2;
    if ( y > 4) {
      y = y - 1;
    }
    System.out.println(x + " " + y +" ");
    x = x + 1;
    }
  }
}

/*
0 2 
1 4 
2 5 
3 6 
4 7 

*/