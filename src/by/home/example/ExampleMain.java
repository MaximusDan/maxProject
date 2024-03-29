package by.home.example;

public class ExampleMain {

    public static void main(String[] args) {

        // todo P1 Создание объекта
        Human hum = new Human();

        //Чтоб обратиться к полю объекта, используется следующий синтаксис. (объекта.название_поля)
        //Затем в это поле можно занести значение
        hum.age = 45;

        //Чтоб достать из поля значение, используется тот же синтаксис
        int a = hum.age;
        System.out.println(a);

        // todo P3 вызов метода
        //Чтоб вызвать метод, используется следующий синтаксис. (объекта.название_метода)
        //При это объект автоматически передаётся в метод.
        hum.show();

        //Чтоб в методе обратиться к этом объекту, используется оператор THIS (Пример внутри метода)
        hum.operatorThis();

        //В метод можно передать значение любое и сколько угодно значений. Все передаваемые значения записываются в круглые скобки
        hum.testMethod(20, "Hello", 3.14);
    }

}
