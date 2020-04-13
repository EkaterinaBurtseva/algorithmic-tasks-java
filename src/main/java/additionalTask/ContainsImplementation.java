package additionalTask;

public class ContainsImplementation {

    public static int findSubstringIndex(String input, String substring) {
        int result = -1;

        for (int i = 0; i < input.length(); ++i) {
            for (int j = 0; j < substring.length(); ++j) {
                if (input.charAt(i + j) != substring.charAt(j)) {
                    break;
                }

                if (j == substring.length() - 1) {
                    return i;
                }
            }
        }

        return result;
    }

}
