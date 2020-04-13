package additionalTask;

import java.time.Duration;
import java.time.Instant;

public class ExamplesFT2 {

        public static void main(String[] args) {
            Instant t1 = Instant.ofEpochSecond(1537797757);
            Instant t2 = Instant.ofEpochSecond(1537797755);

            System.out.println(areTimestampsWithinRange(t1, t2, 1));
        }

        public static Boolean areTimestampsWithinRange(Instant timestamp1, Instant timestamp2, int interval) {

            if (interval < 0) {
                return false;
            }

            Duration duration = Duration.between(timestamp1, timestamp2);
            long secondsBetween = duration.abs().getSeconds();

            return secondsBetween >= interval;
        }
    }

