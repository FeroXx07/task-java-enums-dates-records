package level_2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppointmentManagerTest {
    AppointmentManager appointmentManager = new AppointmentManager();

    @Test
    void sortAppointments() {
        List<LocalDateTime> expected = new ArrayList<>(List.of(
                LocalDateTime.of(2026, 10, 17, 10, 30),
                LocalDateTime.of(2026, 10, 17, 12, 0),
                LocalDateTime.of(2026, 10, 18, 9, 30),
                LocalDateTime.of(2026, 10, 18, 14, 0),
                LocalDateTime.of(2026, 10, 20, 16, 30),
                LocalDateTime.of(2026, 11, 19, 11, 0),
                LocalDateTime.of(2026, 12, 17, 9, 0)));

        assertThat(appointmentManager.getSorted()).containsExactlyElementsOf(expected);
    }
}