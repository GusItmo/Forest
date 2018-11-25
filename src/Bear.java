public class Bear extends Animal {

    void eatWolf (Wolf wolf) {


        wolf.setAlive(false);
        setWeight(getWeight() + 4);
        System.out.println("Медведь съел волка");
    }

    void eatRabbit(Rabbit rabbit) {
        rabbit.setAlive(false);
        System.out.println("Волк съел кролика");
        setWeight(getWeight() + 2);
    }
}
