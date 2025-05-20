package Old_Homework.Homework_47_48;

import java.util.Comparator;
import java.util.Objects;

public class TaskManager implements Comparable<TaskManager> {

    private String name;
    private int priority;
    private String category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskManager that = (TaskManager) o;
        return priority == that.priority && Objects.equals(name, that.name) && Objects.equals(category, that.category);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, priority, category);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public TaskManager(Builder taskBuilder) {
        this.name = taskBuilder.name;
        this.priority = taskBuilder.priority;
        this.category = taskBuilder.category;
    }


    @Override
    public int compareTo(TaskManager o) {
        return Comparator.comparing(TaskManager::getPriority)
                .thenComparing(TaskManager::getCategory)
                .thenComparing(TaskManager::getName)
                .compare(this, o);
    }


    public static class Builder {
        private static String name;
        private static int priority;
        private static String category;


        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public TaskManager build() {
            return new TaskManager(this);
        }
    }


    @Override
    public String toString() {
        return name + ", имеет " + priority + " приоритет, относится к категории " + category;
    }
}
