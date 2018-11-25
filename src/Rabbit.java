public class Rabbit extends Animal {
    public String name = "Кролик";
    void eatGrass(Grass grass) {

        setWeight(getWeight() + 1);
    }

    public String getName() {
        return name;
    }
}
