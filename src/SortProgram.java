public class SortProgram {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "bat"};

        System.out.print("Before sorting: ");
        for (String w : words) System.out.print(w + " ");
        System.out.println();

        // simple sort
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.print("After sorting: ");
        for (String w : words) System.out.print(w + " ");
        System.out.println();
    }
}
