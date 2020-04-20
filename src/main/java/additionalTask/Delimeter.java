package additionalTask;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Delimeter {
    public static void main(String[] args) {
        String[] param = {"a", "s", "c"};
        solutionJava8(param);
        solution(param);
    }


    public static void solutionJava8(String[] values) {
        Arrays.stream(values).collect(Collectors.joining(","));

    }

    public static String solution(String[] values) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; values != null && i < values.length; i++) {
            sb.append(values[i]);
            if (i < values.length - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
