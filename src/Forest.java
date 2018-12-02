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



        for (int i = 0; i < 1000 ; i++) {

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

        Rabbit rabbitAtTheField = new Rabbit(1,5, 10) ;
        localForestKeeper.setText("Вот мы и добрались. Смотри, кто это там? Да это же кролик! Стреляй в него скорее, только прицелься получше!");
        System.out.println(localForestKeeper.getSpeech());


        for (int i = 0; i <1000 ; i++) {

            System.out.println("Введите '1' для выстрела:");
        int shootAtTheField = scanner.nextInt();

        if (shootAtTheField == 1) {

            if (guest.shoot(rabbitAtTheField).isSuccess()) {

                localForestKeeper.setText("Отличный выстрел! Ну ка....Да это заец весит килограмм " + rabbitAtTheField.getWeight() + " не меньше! \n Ну что, пойдем дальше!" );
                System.out.println(localForestKeeper.getSpeech());

            } else {  localForestKeeper.setText("Ну... ничего страшного! Первый блин всегда комом.");
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
        Rabbit rabbitAtTheRoad = new Rabbit(5,10,5);

        localForestKeeper.setText("Стоп! Смотри, там, в кустах... Волк! И кажется он охотится на зайца! Теперь у тебя две цели. Решай в кого стрелять.");
        System.out.println(localForestKeeper.getSpeech());

       for (int i = 0; i < 10 ; i++) {

            System.out.println("Введите '1', чтобы выстрелить в зайца или '2', чтобы выстрелить в волка:");
            int shootChooseAtTheRoad = scanner.nextInt();

        switch (shootChooseAtTheRoad) {

            case 1:

            if (guest.shoot(rabbitAtTheRoad).isSuccess()) {
                localForestKeeper.setText("Классный выстрел! Только видимо теперь у нас проблемы, похоже волк задумал что-то нехорошее...");
                System.out.println(localForestKeeper.getSpeech());
                System.out.println("Волк бежит на вас!");
            } else { localForestKeeper.setText("Эх, не повезло... Что это? Похоже волк задумал что-то нехорошее...");
                System.out.println(localForestKeeper.getSpeech());
                System.out.println("Волк бежит на вас!");
            return;
            }

            case 2:

            if (guest.shoot(wolfAtTheRoad).isSuccess()) {
                localForestKeeper.setText("Классный выстрел! Вот это добыча достойная охотника!");
                System.out.println(localForestKeeper.getSpeech());
                return;
            } else { wolfAtTheRoad.eatAnimal(wolfAtTheRoad, rabbitAtTheRoad);
                localForestKeeper.setText("Эх, сейчас промах как никогда ни к чему! Теперь волк захочет сделать с нами тоже, что и с зайцем!");
                System.out.println(localForestKeeper.getSpeech());
                System.out.println("Волк бежит на вас!");}

                return;

            default:
                    localForestKeeper.setText("Советую поторопиться с выстрелом");
                    System.out.println(localForestKeeper.getSpeech());


        }

        }
        System.exit(0);
       }


    }

