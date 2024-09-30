package ru.naumen;

import ru.naumen.Task;

import java.util.LinkedList;
import java.util.List;


public class TaskTest implements Task {
    private final LinkedList<String> task;

    public TaskTest() {
        task = new LinkedList<>(List.of("task aa", "task bb", "task cc", "task dd"));
        System.out.println("Запустим метод start");
        start(task);
        System.out.println("Запустим метод стоп");
        stop();
    }

    @Override
    public void start(LinkedList<String> list) {
        System.out.println("Метод начал чтение данных из очереди");
        for (String s : list) {
            System.out.println("Выполлняем задачу " + s);
        }
    }

    @Override
    public void stop() {
        System.out.println("Метод остановил процесс");

    }
}
