
class Teacher extends Person {
    private String subject;
    // data clumps
    private String phone;
    private String email;
    private String height;
    private String weight;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}