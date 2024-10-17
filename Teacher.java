
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String phone, String email, int height, int weight, String subject) {
        super(name, age, phone, email, height, weight);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}