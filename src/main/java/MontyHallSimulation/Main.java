package MontyHallSimulation;

import java.util.HashMap;
import java.util.Random;
/**
 * В качестве задачи предлагаю вам реализовать код для
 * демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия )
 * и наглядно убедиться в верности парадокса
 * (запустить игру в цикле на 1000 и вывести итоговый счет).
 * Необходимо:
 * Создать свой Java Maven или Gradle проект;
 * Подключить зависимость lombok.
 * Можно подумать о подключении какой-нибудь
 * математической библиотеки для работы со статистикой
 * Самостоятельно реализовать прикладную задачу;
 * Сохранить результат в HashMap<шаг теста, результат>
 * Вывести на экран статистику по победам и поражениям
 */

public class Main {
    public static void main(String[] args) {
        MontyHallSimulation simulation = new MontyHallSimulation();
        simulation.runSimulation();
        simulation.printResults();
    }
}


