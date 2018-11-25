public class Man {
    String name;
    int age;
    int weight;

    ShootResult shoot(Animal shootTarget) {

        boolean success = (Math.random() > 0.5D);
        ShootResult result = new ShootResult(shootTarget, success);


        if (result.isSuccess()) {
            System.out.println(shootTarget.getClass().getName() + " убит");
        } else {
            System.out.println("Вы промахнулись!");
        }

        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
