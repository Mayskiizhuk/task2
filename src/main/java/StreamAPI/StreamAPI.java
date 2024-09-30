package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public StreamAPI() {
        ArrayList<Employee> people = new ArrayList<>();
        people.add(new Employee("Sasha", 39, "HR", 250000.0));
        people.add(new Employee("Slava", 38, "top", 100000.0));
        people.add(new Employee("Marina", 40, "top", 200000.0));
        people.add(new Employee("Olga", 33, "IT", 100000.0));
        people.add(new Employee("Valera", 20, "IT", 70000.0));
        System.out.println("Предзаполненный список сотрудников");
        System.out.println(people);
        System.out.println("Преобразованный список сотрудников в список строк вида Имя - Отдел ");
        List<String> nameSalary = people.stream()
                .map(p -> p.getFullName() + " - " + p.getDepartment())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(nameSalary);
   }
}
