package com.practice.dsa.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSample {

    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee());
        employeesList.stream().sorted(Comparator.comparing(Employee::getName)).filter(obj -> obj.age > 30).collect(Collectors.toList());
    }

    private static class Employee {
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
