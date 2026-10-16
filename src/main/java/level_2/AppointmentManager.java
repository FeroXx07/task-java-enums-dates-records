package level_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    List<LocalDateTime> appointmentTimes;

    public AppointmentManager() {
        appointmentTimes = new ArrayList<>( List.of(
                LocalDateTime.of(2026, 10, 17, 9, 0),
                LocalDateTime.of(2026, 10, 17, 10, 30),
                LocalDateTime.of(2026, 10, 17, 12, 0),
                LocalDateTime.of(2026, 10, 18, 9, 30),
                LocalDateTime.of(2026, 10, 18, 14, 0),
                LocalDateTime.of(2026, 10, 19, 11, 0),
                LocalDateTime.of(2026, 10, 20, 16, 30)));

    }

    public void showAppointmentsOrdered() {
        appointmentTimes
                .stream()
                .sorted()
                .map(t ->t.format(DateTimeUtility.FORMAT_DAY_MONTH_YEAR_HOUR_MINUTE))
                .forEach(System.out::println);
    }
}
