public abstract class Animal {

    private int age;
    private int weight;
    private boolean isAlive;
    private int speed;
    private final String generalName;
    private final String nameInRodP;

    public Animal(int age, int weight, int speed, String generalName, String nameInRodP, boolean isAlive) {
        this.age = age;
        this.weight = weight;
        this.speed = speed;
        this.generalName = generalName;
        this.nameInRodP = nameInRodP;
        this.isAlive = isAlive;
    }

    public static void main(String[] args) {
//        Bear bear = new Bear(17, 200, 20, "Медведь", "Медведя");
    }

    void setAge (int age) {

        this.age = age;
    }

    void setWeight (int weight) {

        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;


    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public void eatAnimal(Animal animal1, Animal animal2) {

        animal2.setAlive(false);
        animal1.setWeight(getWeight() + 2);
        System.out.println(animal1.getGeneralName() + " съел " + animal2.getNameInRodP() + ".");

    }

    public String getGeneralName() {
        return generalName;
    }

    public String getNameInRodP() {
        return nameInRodP;
    }

    RunResult run(Animal animal1, Animal animal2, boolean success2) {
        if (animal1.getSpeed()>animal2.getSpeed()) {
            success2 = true;
        } else {
            success2 = false;
        }


            RunResult result = new RunResult(animal1, animal2, success2);

        if (result.isSuccess()) {
            animal1.eatAnimal(animal1, animal2);
        } else {
            System.out.println(/*animal2.getClass().getName()*/ animal2.generalName + " убежал.");
        }
        return result;
    }
}
