
class Student extends Person {
    public String studentName;
    private int studentAge;
    private String major;

    public Student(String name, int age, String phone, String email, int height, int weight, String major) {
        super(name, age, phone, email, height, weight);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + studentName + ", Age: " + studentAge + ", Major" + major);
        // super.displayInfo();
        // System.out.println("Major: " + major);
    }
}