package level_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;


@ParameterizedClass
@FieldSource("days") // Specifies JUnit to look for a field named days and use its contents as the source of class arguments.
class DayUtilityTest {
    static final List<Arguments> days = List.of(
            Arguments.of(List.of(
                    "MONDAY", "TUESDAY", "WEDNESDAY",
                    "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"
            ))
    );

    @Parameter
    List<String> dayNames;

    @Test
    void shouldParseAllValidDays() {
        for (String name : dayNames) {
            assertEquals(Day.valueOf(name), DayUtility.parseStringToEnum(name));
        }
    }

    @Test
    void shouldIdentifyWeekendDays() {
        for (String name : dayNames) {
            Day day = Day.valueOf(name);

            assertThat(DayUtility.isDayWeekend(day))
                    .as("Should identify %s correctly", day)
                    .isEqualTo(day == Day.SATURDAY || day == Day.SUNDAY);
        }
    }

    @Test
    void shouldThrowWhenDayStringIsNull() {
        assertThatThrownBy(() -> DayUtility.parseStringToEnum(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The day string is null or blank.");
    }

    @Test
    void shouldThrowWhenDayStringIsBlank() {
        assertThatThrownBy(() -> DayUtility.parseStringToEnum(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The day string is null or blank.");
    }

    @Test
    void shouldReturnNullForInvalidDay() {
        assertThat(DayUtility.parseStringToEnum("FUNDAY"))
                .isNull();
    }

}