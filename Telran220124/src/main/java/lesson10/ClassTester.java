package lesson10;

public class ClassTester {
    public static void main(String[] args) {
        // элементы данных - атрибуты/свойства - состояние класса
        // методы - поведение
        // конструктор - способ создать экземпляр
        // идентификатор - целое или строковое свойство
        // вложенные классы

        TaxiPark tp = new TaxiPark();
        TaxiPark.Dispatcher dp = new TaxiPark.Dispatcher();

        //создание экземпляра внутреннего класса
        TaxiPark.Taxi taxi = tp.new Taxi();

        Zoo zoo = new Zoo();
        Zoo.Monkey monkey = zoo.new Monkey();
        Zoo.Monkey.Banana banana = monkey.new Banana();

        System.out.println("sort is " + banana.getSort());

        // локальный внутренний класс, определяется внутри метода,
        // его невозможно использовать за пределами метода,
        // в котором он объявлен
        class Program {
            public void print(){
                System.out.println("Hello from program");
            }
        }

        Program program = new Program();
        program.print();
    }
}
