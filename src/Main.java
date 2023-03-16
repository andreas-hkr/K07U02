import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in en mening med minst två ord:");
        String sentence = input.nextLine();

        if (sentence.indexOf(' ') != -1) {
            int count = sentence.length();
            int firstSpace = sentence.indexOf(' ');
            int lastSpace = sentence.lastIndexOf(' ');
            String firstWord = sentence.substring(0, firstSpace);
            String lastWord = sentence.substring(lastSpace + 1);

            System.out.println("Meningen du matade in innhåller " + count + " tecken");
            System.out.println("Det första ordet var: " + firstWord);
            System.out.println("Det sista ordet var: " + lastWord);
        } else {
            System.out.println("Du måste mata in minst två ord.");
        }
    }
}