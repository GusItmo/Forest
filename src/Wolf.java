public class Wolf extends Animal {
    public String name = "Волк";

    void eatRabbit(Rabbit rabbit) {

        rabbit.setAlive(false);
        setWeight(getWeight() + 2);
        System.out.println("Волк съел кролика");

    }

    public String getName() {
        return name;
    }
}

