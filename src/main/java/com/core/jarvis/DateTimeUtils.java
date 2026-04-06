package com.core.jarvis;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    public static String toLocalDateTime(ZonedDateTime date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern("d/M/yyyy, h:mm:ss a"));
    }

    public static String toLocalDateTime(Instant date) {
        return date.atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern("d/M/yyyy, h:mm:ss a"));
    }

    public static ZonedDateTime toZonedDateTime(String date) {
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
        return ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
    }

    public static String toFormattedDate(String date) {
        LocalDateTime dateTime = LocalDateTime.parse(date.substring(0, 19), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a"));
    }
    public static String toFormattedDate(ZonedDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a"));
    }
}
