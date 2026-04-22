import java.util.Scanner;

public class Scrabble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Игрок 1, введите слово: ");
        String word1 = scanner.nextLine().toUpperCase();

        System.out.print("Игрок 2, введите слово: ");
        String word2 = scanner.nextLine().toUpperCase();

        int score1 = computeScore(word1);
        int score2 = computeScore(word2);

        if (score1 > score2) {
            System.out.println("Победил Игрок 1!");
        } else if (score2 > score1) {
            System.out.println("Победил Игрок 2!");
        } else {
            System.out.println("Ничья!");
        }

        scanner.close();
    }

    public static int computeScore(String word) {
        int result = 0;
        for(int i = 0; i < word.length(); i++){
            result += POINT[word.charAt(i) - 'A'];
        }    
    return result;
    }
    // Массив в конце класса, как ты просил
    private static final int[] POINT = {
        1,  // A
        3,  // B
        3,  // C
        2,  // D
        1,  // E
        4,  // F
        2,  // G
        4,  // H
        1,  // I
        8,  // J
        5,  // K
        1,  // L
        3,  // M
        1,  // N
        1,  // O
        3,  // P
        10, // Q
        1,  // R
        1,  // S
        1,  // T
        1,  // U
        4,  // V
        4,  // W
        8,  // X
        4,  // Y
        10  // Z
    };
}
