import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ForestKeeper localForestKeeper = new ForestKeeper();
        Man guest = new Man();
        Wolf wolfAtTheRoad = new Wolf(3, 8, 8);
        Rabbit rabbitAtTheRoad = new Rabbit(5, 10, 5);
        Scanner scanner = new Scanner (System.in);

        localForestKeeper.setText("Стоп! Смотри, там, в кустах... Волк! И кажется он охотится на зайца! Теперь у тебя две цели. Решай в кого стрелять.");
        System.out.println(localForestKeeper.getSpeech());

        for (int i = 0; i < 10; i++) {

            System.out.println("Введите '1', чтобы выстрелить в зайца или '2', чтобы выстрелить в волка:");
            int shootChooseAtTheRoad = scanner.nextInt();

            switch (shootChooseAtTheRoad) {

                case 1:

                    if (guest.shoot(rabbitAtTheRoad).isSuccess()) {
                        localForestKeeper.setText("Классный выстрел! Только видимо теперь у нас проблемы, похоже волк задумал что-то нехорошее...");
                        System.out.println(localForestKeeper.getSpeech());
                        System.out.println("Волк бежит на вас!");
                        return;
                    } else {
                        localForestKeeper.setText("Эх, не повезло... Что это? Похоже волк задумал что-то нехорошее...");
                        System.out.println(localForestKeeper.getSpeech());
                        System.out.println("Волк бежит на вас!");
                        return;
                    }

                case 2:

                    if (guest.shoot(wolfAtTheRoad).isSuccess()) {
                        localForestKeeper.setText("Классный выстрел! Вот это добыча достойная охотника!");
                        System.out.println(localForestKeeper.getSpeech());
                        return;
                    } else {
                        wolfAtTheRoad.eatAnimal(wolfAtTheRoad, rabbitAtTheRoad);
                        localForestKeeper.setText("Эх, сейчас промах как никогда ни к чему! Теперь волк захочет сделать с нами тоже, что и с зайцем!");
                        System.out.println(localForestKeeper.getSpeech());
                        System.out.println("Волк бежит на вас!");

                    }

                    return;

                default:
                    localForestKeeper.setText("Советую поторопиться с выстрелом");
                    System.out.println(localForestKeeper.getSpeech());
            }
        }
        System.exit(0);

    }
}