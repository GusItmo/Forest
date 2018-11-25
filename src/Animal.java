public abstract class Animal {

    private int age;
    private int weight;
    private boolean isAlive;

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


}
