
class Teacher extends Person {
    public String teacherName;
    private int teacherAge;
    private String subject;

    public Teacher(String name, int age, String phone, String email, int height, int weight, String subject) {
        super(name, age, phone, email, height, weight);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + teacherName + ", Age: " + teacherAge + ", Subject" + subject);
        // super.displayInfo();
        // System.out.println("Subject: " + subject);
    }
}