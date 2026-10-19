package level_2;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.assertj.core.api.Assertions.assertThat;

class DateTimeUtilityTest {

    @Test
    void getDiffBetweenDates() {
        LocalDate now = LocalDate.now();
        Period p1 = DateTimeUtility.getDiffBetweenDates(now, now.minusDays(12));
        Period p2 = DateTimeUtility.getDiffBetweenDates(now, now.plusMonths(3));

        assertThat(p1).isEqualTo(Period.of(0, 0, -12));
        assertThat(p2).isEqualTo(Period.of(0, 3, 0));
    }

    @Test
    void getDiffBetweenDateTimes() {
        LocalDateTime now = LocalDateTime.now();
        Duration d1 = DateTimeUtility.getDiffBetweenDateTimes(now, now.minusHours(12).minusDays(3));
        Duration d2 = DateTimeUtility.getDiffBetweenDateTimes(now, now.plusSeconds(3).plusMinutes(59));

        assertThat(d1).isEqualTo(Duration.ofDays(-3).minusHours(12));
        assertThat(d2).isEqualTo(Duration.ofMinutes(59).plusSeconds(3));
    }

    @Test
    void isDatePreviousToToday() {
        assertThat(DateTimeUtility.isDatePreviousToToday(LocalDate.now().minusDays(1))).isTrue();
        assertThat(DateTimeUtility.isDatePreviousToToday(LocalDate.now().plusDays(1))).isFalse();
    }
}