import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println(data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(data2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Date1 is before date2 : " + data1.isBefore(data2));
        System.out.println("Date2 is after date1 : " + data2.isAfter(data1));
        System.out.println("Input date is equal to current date " + data1.equals(LocalDate.now()));
        System.out.println("Input date is equal to current date " + data2.equals(LocalDate.now()));


    }
}