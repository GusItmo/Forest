public class Man {
    String name;
    int age;
    int weight;

    ShootResult shoot(Animal shootTarget) {

        boolean success = (Math.random() > 0.5D);
        ShootResult result = new ShootResult(shootTarget, success);
        System.out.println("ПФФ!!!(Выстрел)");


        if (result.isSuccess()) {
            shootTarget.setAlive(false);
            System.out.println(shootTarget.getGeneralName() + " убит");
        } else {
            System.out.println("Вы промахнулись!" + shootTarget.getGeneralName() + " убежал.");
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
