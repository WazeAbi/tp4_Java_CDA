import java.util.Random;

public class Exo1 {
    public static void main(String[] args) {
       int[] tab = new int[10];
        Random random = new Random();
        for (int i=0; i<tab.length;i++){
            tab[i]=random.nextInt(100);
            System.out.println(tab[i]);
        }

    }

}
