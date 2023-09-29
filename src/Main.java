import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Przeszukiwanie liniowe licz podzielnych przez 5");
        System.out.println("Podaj wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
        int sizeTab = scanner.nextInt();
        int[] numberTab;
        numberTab = new int[sizeTab];
        for (int i = 0; i < sizeTab; i++) {
            if (i % 5 == 0) System.out.println();
            numberTab[i] = (int) (Math.random() * 100);
            System.out.print(czyPodzielnaPrzez5(new int[]{numberTab[i]}));
            }
        }
    public static int czyPodzielnaPrzez5(int[]numberTab) {
        int i = 0;
        int n = numberTab.length;
        while (i < n && numberTab[i] % 5 != 0);
        return i;
    }
}
