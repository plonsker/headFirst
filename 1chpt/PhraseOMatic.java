public class PhraseOMatic {
  public static void main (String[] args){
    String[] wordListOne = {"scalable", "crossfunciontal", "platform", "invest"
    };

    String[] wordListTwo = {"changing lives", "disruption", "cloud-based solutions"
    };

    String[] wordListThree = {"SaaS", "Web 3.0", "IPO", "culture", "open-office"};
  
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    System.out.println("What we need is " + phrase);
  }
    

}