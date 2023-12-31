package Practic_11.number1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskInfo {
    public static void main(String[] args) {
        String developerLastName = "Степан Казаков";

        Date dateAssigned = new Date();

        long currentTimeMillis = System.currentTimeMillis();
        long deadlineMillis = currentTimeMillis + 7 * 24 * 60 * 60 * 1000;
        Date dateSubmitted = new Date(deadlineMillis);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(dateAssigned));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(dateSubmitted));
    }
}
