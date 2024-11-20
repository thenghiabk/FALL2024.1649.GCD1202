package L01_Review;

class User {
    // data fields
    private String name;
    private int age;
    private double bonus;

    // constructor
    public User ( String name, int age, double bonus ) {
        this.name = name;
        this.age = age;
        this.bonus = bonus;
    }

    // methods
    @Override
    public String toString () {
        return "Name: " + this.name + ", Age: "
                + this.age + ", Bonus: " + this.bonus;
    }
}
