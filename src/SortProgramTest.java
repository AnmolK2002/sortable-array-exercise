public class SortProgramTest {
    public static void main(String[] args) {
        String[] test = {"pear", "apple", "mango"};
        System.out.print("Test before: ");
        for (String w : test) System.out.print(w + " ");
        System.out.println();

        // reuse simple sort
        for (int i = 0; i < test.length - 1; i++) {
            for (int j = i + 1; j < test.length; j++) {
                if (test[i].compareTo(test[j]) > 0) {
                    String temp = test[i];
                    test[i] = test[j];
                    test[j] = temp;
                }
            }
        }

        System.out.print("Test after: ");
        for (String w : test) System.out.print(w + " ");
        System.out.println();
    }
}
