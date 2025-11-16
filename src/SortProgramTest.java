public class SortProgramTest {
    public static void main(String[] args) {
        // Integer test
        int[] intInput = {5, 3, 9, 1};
        int[] intResult = SortProgram.sortIntegers(intInput);
        System.out.println("Integer sort test passed? " + 
            (intResult[0] == 1 && intResult[1] == 3 && intResult[2] == 5 && intResult[3] == 9));

        // String test
        String[] strInput = {"banana", "apple", "dog"};
        String[] strResult = SortProgram.sortStrings(strInput);
        System.out.println("String sort test passed? " + 
            (strResult[0].equals("apple") && strResult[1].equals("banana") && strResult[2].equals("dog")));
    }
}
