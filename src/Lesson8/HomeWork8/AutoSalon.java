package Lesson8.HomeWork8;

public interface AutoSalon {
    int buyCar(Car someCar);

    int sellCar(int parkingSlotNumber);

    void report ();

}

   /* Создайте интерфейс под названием автосалон со следующими методами:
        - int buyCar(Car someCar);
        // метод принимающий машину в автосалон,
         в случае успеха  возвращающий сумму за которую удалось
         продать машину и списывающий с баланса автосалона средства,
          в случае неуспеха возвращающий 0
        - int sellCar( int parkingSlotNumber);
         // метод продающий машину из автосалона, цена продажи на 20 %
          боьше оценочной стоимости.
        В случае наличия машины на указанном месте метод возвращает
         сумму продажи и записывает деньги на баланс,
          в случае отсутствия возвращает 0 и выводит соответствующее
           уведомление.
        - String report () // метод выводящий на єкран отчет о состоянии
         автосалона список автомобилей и на каких они меслах, баланс.*/