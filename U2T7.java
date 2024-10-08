import java.util.Scanner;
public class U2T7{
    public static void main(String[] arg){
        Scanner scan= new Scanner(System.in);
        System.out.print("input string 1: ");
        String w1= scan.nextLine();
        System.out.print("input string 2: ");
        String w2= scan.nextLine();
        scan.close();
        if (w1.length()>w2.length()){
            System.out.print(w1+" is longer");
        } else if (w2.length()>w1.length()){
            System.out.print(w2+" is longer");
        } else {
            System.out.print("Both strings have the same length");
        }
        System.out.println("first half: "+w1.substring(0,(w1.length()/2)));
        System.out.println("second half: "+w1.substring((w1.length()/2)));
        System.out.println("first half: "+w2.substring(0,(w2.length()/2)));
        System.out.println("second half: "+w2.substring((w2.length()/2)));
        if (w1.indexOf(w2)>-1){
        System.out.println(w2+" is found in "+w1+" at "+ w1.indexOf(w2));
        } else {
        System.out.println(w2+" is Not in "+w1);
        }
    }
}