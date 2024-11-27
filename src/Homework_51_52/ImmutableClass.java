package Homework_51_52;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass implements Comparable<ImmutableClass> {

    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass mutableClass;


    public ImmutableClass(String name, List<Integer> numbersList, CustomMutableClass mutableClass) {
        this.name = name;
        this.numbers = new ArrayList<>();
        numbers.addAll(numbersList);
        this.mutableClass = new CustomMutableClass(mutableClass);
    }

    public String getName() {
        return name;
    }

    public CustomMutableClass getMutableClass() {
        return new CustomMutableClass(mutableClass);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Класс " + name + numbers + mutableClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers);
    }

    @Override
    public int compareTo(ImmutableClass o) {
        return Comparator.comparing(ImmutableClass::getName).compare(this, o);
    }
}
