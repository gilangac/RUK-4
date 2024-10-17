
class Student extends Person {
    private String major;

    public Student(String name, int age, String phone, String email, int height, int weight, String major) {
        super(name, age, phone, email, height, weight);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}