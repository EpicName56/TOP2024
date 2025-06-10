package spring_homework_9_10;

// Интерфейс продукта
interface Product {
    void operation();
}

// Реализация продукта A
class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("Операция выполнена продуктом А");
    }
}

// Реализация продукта B
class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("Операция выполнена продуктом B");
    }
}

// Абстрактная фабрика
abstract class Creator {
    public abstract Product factoryMethod();

    public final void someOperation() {
        Product product = factoryMethod();
        product.operation();
    }
}

// Конкретная фабрика для продукта A
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

// Конкретная фабрика для продукта B
class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

// Клиентский код
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();
    }
}
