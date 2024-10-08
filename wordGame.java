import java.util.Scanner;
public class wordGame {
    public static void main(String[] arg){
        Scanner scan= new Scanner(System.in);
        System.out.println("input first word: ");
        String w1= scan.nextLine();
        String w2;
        int score=0;
        while (!(score==50)){
        System.out.println("input next word: ");
        w2 = scan.nextLine();
        if (w1.equals(w2)){
            score+=5;
        System.out.println("Same length +5; Score: "+score);
        }
        if(w1.length()==w2.length()){
            score+=5;
            System.out.println("Last two letters of last word match first two of this word +5; Score: "+score);
        }
        if ((w2.regionMatches(0,w1,(w1.length()-2),2))){
                score+=5;
                System.out.println("Last two letters of last word match first two of this word +5; Score: "+score);
            }
        if (w2.contains(w1.subSequence(0, 1))){
                score+=3;
                System.out.println("Contains starting letter of last word +3; Score: "+score);
            }
        if (w1.compareTo(w2)>0){
            score-=5;
          System.out.println("Comes before alphabetically -5; Score:"+score);
          } else {
            score+=2;
          System.out.println("Comes after alphabetically +2; Score:"+score);
          }
          w1=w2;
        }
        scan.close();
    }
}
