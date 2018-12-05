public class Rabbit extends Animal {


    public Rabbit(int age, int weight, int speed) {
        super(age, weight, speed, "Кролик", "Кролика", true);
    }

    void eatGrass(Grass grass) {

        setWeight(getWeight() + 1);
    }

    }
