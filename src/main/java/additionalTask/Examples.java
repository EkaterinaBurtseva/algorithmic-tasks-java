package additionalTask;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {

    public static class FilterTrades {
        public static List<Trade> filterTrades(List<Trade> trades, Instant timestampFrom, Instant timestampTo) {
            if (timestampFrom == null
                    || timestampTo == null
                    || timestampFrom.getEpochSecond() >= timestampTo.getEpochSecond()) {
                return Collections.singletonList(new Trade(Instant.ofEpochSecond(0)));
            }

            long from = timestampFrom.getEpochSecond();
            long to = timestampTo.getEpochSecond();

            return trades.stream()
                    .filter(trade -> {
                        if (trade == null || trade.getTimestamp() == null) {
                            return false;
                        }

                        long tradeSeconds = trade.getTimestamp().getEpochSecond();

                        return tradeSeconds >= from && tradeSeconds <= to;
                    }).collect(Collectors.toList());
        }

        private static Trade parseTrade(String input) {
            if (input.equals("null")){
                return null;
            }
            return new Trade(parseInstant(input));
        }

        private static Instant parseInstant(String input) {
            if (input.equals("null")){
                return null;
            }
            return Instant.ofEpochSecond(Long.parseLong(input));
        }

        private static class Trade{
            private Instant timestamp;

            Trade(Instant timestamp){
                this.timestamp = timestamp;
            }

            public Instant getTimestamp() {
                return timestamp;
            }
        }
    }


}
