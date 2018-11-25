public class Forest {
    public static void main(String[] args) {

        Wolf youngWolf = new Wolf();

        Rabbit rabbit1 = new Rabbit ();
        /*youngWolf.setAge(7);
        youngWolf.setWeight(20);
        if (youngWolf.getAge() < 5) {
            System.out.println("Молодой волк весит: " + youngWolf.getWeight());
        } else {
            System.out.println("Старый волк весит: " + youngWolf.getWeight());
        }
        Rabbit oldRabbit = new Rabbit();
        youngWolf.eatRabbit(oldRabbit);
        System.out.println("Теперь волк весит: " + youngWolf.getWeight());*/

        Man hunter = new Man();
       hunter.shoot(youngWolf);
       hunter.shoot(rabbit1);

    }
}
