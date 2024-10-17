import java.util.Scanner;

class Teacher extends Person {
    public String teacherName;
    private int teacherAge;
    private String subject;

    public Teacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        this.teacherName = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        this.teacherAge = scanner.nextInt();
        scanner.nextLine();
        // super();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Masukkan mata pelajaran: ");
        this.subject = scanner2.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + teacherName + ", Age: " + teacherAge + ", Subject" + subject);
        // super.displayInfo();
        // System.out.println("Subject: " + subject);
    }
}