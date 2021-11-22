package com.practice.dsa.problems;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {

    public static void main(String[] args) {
        List<Employee> empLit = new ArrayList<>();
        empLit.add(new Employee(1, "vara", 101));
        empLit.add(new Employee(1, "te", 102));
        empLit.add(new Employee(2, "apple", 103));
        empLit.stream().sorted(Comparator.comparing(Employee::getSalary)).filter(emp -> emp.getSalary() > 100).map(emp -> emp.getName()).forEach(System.out::println);
        System.out.println("EmpList -->"+empLit);
        empLit.stream().sorted(Comparator.comparing(Employee::getName)).sorted(Comparator.comparingInt(Employee::getId).reversed()).forEach(obj ->{
            System.out.println("employe -->"+obj.getName() +" -- id  -->"+obj.getId());
        });
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] arr = {1, 2, 3, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" arr -->"+arr[i]);
            if (!freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], 1);
            } else {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            }
        }
        System.out.println("freqMap -->" + freqMap);
    }

    private static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

}
