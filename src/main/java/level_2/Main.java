package level_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    void main() {
        DateTimeUtility.showCurrentTimes();

        DateTimeUtility.showDiffBetweenDates(LocalDate.now(), LocalDate.now().minusDays(12));
        DateTimeUtility.showDiffBetweenDates(LocalDate.now(), LocalDate.now().plusMonths(3));

        DateTimeUtility.showDiffBetweenDatesTime(LocalDateTime.now(), LocalDateTime.now().minusDays(12));
        DateTimeUtility.showDiffBetweenDatesTime(LocalDateTime.now(), LocalDateTime.now().plusMonths(3));
    }
}
