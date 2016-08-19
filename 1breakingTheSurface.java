// Sharpen your pencil page 5/pdf page 29

// declare an integer variable named 'size' and give it the value 27
int size = 27;

// string variable name
String name = "Fido";

// new instance of a dog
Dog myDog = new Dog(name, size);

// new integer variable
x = size - 5;

// if dog is smaller than size 15 it will bark 8 times.
if (x < 15) myDog.bark(8);

// if dog is bigger than 3 then he/she can play
while (x > 3) {
  myDog.play();
}

// declare a list of integers variable 'numList' and put 2,4,6,8 into the list
int[] numList = {2,4,6,8};
System.out.println("Hello");
System.out.println("Dog: " + name)
String num = "8";
// parses string into integer
int z = Integer.parseInt(num);

try {
  readTheFile("myFile.txt");
}

catch(FileNotFoundException ex) {
  System.out.println("File not found.")
}


// pdf page 37

/*
given the output:
%java DooBee
DooBeeDooBeeDo

fill in the code
*/

// public class DooBee {
//   public static void main (String[] args){
//     int x = 1;
//     while ( x < _____){
//       System.out.______("Doo");
//       System.out.______("Bee");
//       x = x + 1;
//     }
//     if (x == _____){
//       System.out.print("Do");
//     }
//   }
// }

public class DooBee {
  public static void main (String[] args){
    int x = 1;
    while ( x < 3){
      System.out.print("Doo");
      System.out.print("Bee");
      x = x + 1;
    }
    if (x == 1){
      System.out.print("Do");
    }
  }
}

// bottles of beer

public class BeerSong {
  public static void main (String[] args) {
    int beerNum = 99;
    String word = "bottles";

    while (beerNum > 0) {
      if (beernum == 1) (
        word = "bottle";
        )

        System.out.println (beerNum + " " + word + " of beer on the wall");
        System.out.println(beerNum + " " + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
          beernNum = beerNum - 1;
        if (beerNum > 0) {
          System.out.println(beerNum + " " + word + " of beer on the wall");
        } else {
          System.out.println("No more bottles of beer on the wall");
        }
    }
  }
}

