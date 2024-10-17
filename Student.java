
class Student extends Person {
    private String major;
    // data clumps
    private String phone;
    private String email;
    private String height;
    private String weight;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}