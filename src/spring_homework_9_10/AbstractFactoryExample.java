package spring_homework_9_10;

public class AbstractFactoryExample {

    // Интерфейсы продуктов
    interface Button {
        void render();
    }

    interface TextField {
        void render();
    }

    // Реализации продуктов для Windows
    static class WinButton implements Button {
        @Override
        public void render() {
            System.out.println("Отрисовка кнопки в стиле Windows.");
        }
    }

    static class WinTextField implements TextField {
        @Override
        public void render() {
            System.out.println("Отрисовка поля ввода в стиле Windows.");
        }
    }

    // Реализации продуктов для MacOS
    static class MacButton implements Button {
        @Override
        public void render() {
            System.out.println("Отрисовка кнопки в стиле MacOS.");
        }
    }

    static class MacTextField implements TextField {
        @Override
        public void render() {
            System.out.println("Отрисовка поля ввода в стиле MacOS.");
        }
    }

    // Интерфейс фабрики
    interface GUIFactory {
        Button createButton();
        TextField createTextField();
    }

    // Конкретная фабрика для Windows
    static class WinFactory implements GUIFactory {
        @Override
        public Button createButton() {
            return new WinButton();
        }

        @Override
        public TextField createTextField() {
            return new WinTextField();
        }
    }

    // Конкретная фабрика для MacOS
    static class MacFactory implements GUIFactory {
        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public TextField createTextField() {
            return new MacTextField();
        }
    }

    // Класс приложения
    static class Application {
        private Button button;
        private TextField textField;

        public void setGUI(GUIFactory factory) {
            this.button = factory.createButton();
            this.textField = factory.createTextField();
        }

        public void paint() {
            button.render();
            textField.render();
        }
    }

    public static void main(String[] args) {
        Application app = new Application();

        String osName = System.getProperty("os.name").toLowerCase();

        GUIFactory factory;
        if (osName.contains("windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        app.setGUI(factory);
        app.paint();
    }
}
