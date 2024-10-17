import java.util.Scanner;

class Student extends Person {
    public String studentName;
    private int studentAge;
    private String major;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        this.studentName = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        this.studentAge = scanner.nextInt();
        scanner.nextLine();
        // super();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Masukkan jurusan: ");
        this.major = scanner2.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + studentName + ", Age: " + studentAge + ", Major" + major);
        // super.displayInfo();
        // System.out.println("Major: " + major);
    }
}