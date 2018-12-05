import java.util.Scanner;

public class Forest {
    public static void main(String[] args) {
        ForestKeeper localForestKeeper = new ForestKeeper();
        localForestKeeper.setText("Приветствую тебя в нашем лесу! Меня зовут Джон, я местный лесник. А тебя как звать?");
        System.out.println(localForestKeeper.getSpeech());

        System.out.println("Введите свое имя: ");
        Scanner scanner = new Scanner(System.in);
        String guestName = scanner.nextLine();

        Man guest = new Man();

        localForestKeeper.setText("Очень приятно " + guestName + "!" + " Сегодня прекрасный день для охоты! Ну что, готов выступать?");
        System.out.println(localForestKeeper.getSpeech());


        for (int i = 0; i < 100; i++) {

            System.out.println("Введите '1', если готовы начать охоту:");
            int readyStatus = scanner.nextInt();
            if (readyStatus == 1) {
                localForestKeeper.setText("Прекрасно! Сперва пойдем на главную поляну, обычно там водится куча зайцев.");
                System.out.println(localForestKeeper.getSpeech());
                break;

            } else {
                localForestKeeper.setText("Ну ладно, дай знать, как будешь готов");
                System.out.println(localForestKeeper.getSpeech());
            }

        }

        System.out.println("Идем на поляну...");

        Rabbit rabbitAtTheField = new Rabbit(1, 5, 10);
        localForestKeeper.setText("Вот мы и добрались. Смотри, кто это там? Да это же кролик! Стреляй в него скорее, только прицелься получше!");
        System.out.println(localForestKeeper.getSpeech());


        for (int i = 0; i < 100; i++) {

            System.out.println("Введите '1' для выстрела:");
            int shootAtTheField = scanner.nextInt();

            if (shootAtTheField == 1) {

                if (guest.shoot(rabbitAtTheField).isSuccess()) {

                    localForestKeeper.setText("Отличный выстрел! Ну ка....Да это заец весит килограмм " + rabbitAtTheField.getWeight() + " не меньше! \n Ну что, пойдем дальше!");
                    System.out.println(localForestKeeper.getSpeech());

                } else {
                    localForestKeeper.setText("Ну... ничего страшного! Первый блин всегда комом.");
                    System.out.println(localForestKeeper.getSpeech());
                    localForestKeeper.setText("Ладно,пойдем дальше");
                    System.out.println(localForestKeeper.getText());
                }
                break;
            } else {
                localForestKeeper.setText("Ну ты что, по курку попасть не можешь? ");
                System.out.println(localForestKeeper.getSpeech());
            }
        }


        System.out.println("Идем дальше...");

        Wolf wolfAtTheRoad = new Wolf(3, 8, 8);
        Rabbit rabbitAtTheRoad = new Rabbit(5, 10, 5);

        localForestKeeper.setText("Стоп! Смотри, там, в кустах... Волк! И кажется он охотится на зайца! Теперь у тебя две цели. Решай в кого стрелять.");
        System.out.println(localForestKeeper.getSpeech());


        System.out.println("Введите '1', чтобы выстрелить в зайца или '2', чтобы выстрелить в волка:");
        int shootChooseAtTheRoad = scanner.nextInt();

        switch (shootChooseAtTheRoad) {

            case 1:

                if (guest.shoot(rabbitAtTheRoad).isSuccess()) {
                    localForestKeeper.setText("Классный выстрел! Только теперь у нас проблемы: похоже волк задумал что-то нехорошее...");
                    System.out.println(localForestKeeper.getSpeech());
                    System.out.println("Волк бежит на вас!");
                    break;

                } else {
                    localForestKeeper.setText("Эх, не повезло... Что это? Похоже волк задумал что-то нехорошее...");
                    System.out.println(localForestKeeper.getSpeech());
                    System.out.println("Волк бежит на вас!");
                    break;
                }

            case 2:

                if (guest.shoot(wolfAtTheRoad).isSuccess()) {
                    localForestKeeper.setText("Классный выстрел! Вот это достойная добыча!");
                    System.out.println(localForestKeeper.getSpeech());
                    break;
                } else {
                    wolfAtTheRoad.eatAnimal(wolfAtTheRoad, rabbitAtTheRoad);
                    wolfAtTheRoad.eatAnimal(wolfAtTheRoad, rabbitAtTheRoad);
                    localForestKeeper.setText("Ну как же ты промазал! Похоже теперь волк хочет сделать с нами тоже, что и с зайцем!");
                    System.out.println(localForestKeeper.getSpeech());
                    System.out.println("Волк бежит на вас!");
                    break;
                }


            default:
                localForestKeeper.setText("Советую поторопиться с выстрелом");
                System.out.println(localForestKeeper.getSpeech());


        }

        boolean hasCancelled = false;
        boolean hasCancdelledTwice = false;
        while (!hasCancdelledTwice) {
            for (int i = 0; i < 2; i++) {


                if (wolfAtTheRoad.isAlive()) {

                    localForestKeeper.setText("Стреляй же в него!!!");
                    System.out.println(localForestKeeper.getSpeech());
                    System.out.println("Нажмите '1', чтобы выстрелить:");
                    int shootInWolf = scanner.nextInt();

                    if (shootInWolf == 1) {
                        if (guest.shoot(wolfAtTheRoad).isSuccess()) {

                            localForestKeeper.setText("Мы спасены! Молодчина!");
                            System.out.println(localForestKeeper.getSpeech());
                            return;

                        } else {
                            localForestKeeper.setText("Нам конец!");
                            System.out.println(localForestKeeper.getSpeech());
                            System.out.println("Вас съел волк. Игра окончена!");
                            return;
                        }
                    } else {
                        localForestKeeper.setText("Что же ты медлишь?");
                        System.out.println(localForestKeeper.getSpeech());

                        if (!hasCancelled) {
                            hasCancelled = true;
                        } else {
                            hasCancdelledTwice = true;
                        }
                    }


                }
            }
        }

        if (hasCancdelledTwice) {
            System.out.println("Вы слишком долго не стреляли и волк съел вас. Игра окончена");
        } else if (wolfAtTheRoad.isAlive()) {

            System.out.println("Попытайте удачи в следующий раз");
        } else {
            System.out.println("Ух, дружище, было здорово охотится с тобой. Пора заканчивать. Приходи в следующий раз!");
        }
        System.exit(0);
        }



}


