
import java.util.*;

public class StopWordElimination {

    // Set of common English stop words
    private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
            "a", "an", "the", "is", "are", "was", "were", "in", "on", "at",
            "of", "for", "to", "and", "or", "but", "with", "by", "as",
            "from", "that", "this", "it", "be", "has", "have", "had"
    ));

    public static String removeStopWords(String text) {
        StringBuilder result = new StringBuilder();

        // Convert to lowercase and split by spaces
        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            // Remove punctuation
            word = word.replaceAll("[^a-z]", "");

            if (!STOP_WORDS.contains(word) && !word.isEmpty()) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String filteredSentence = removeStopWords(sentence);

        System.out.println("\nAfter stop word elimination:");
        System.out.println(filteredSentence);

        sc.close();
    }
}
