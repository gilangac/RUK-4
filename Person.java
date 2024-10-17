
class Person {
    public String name;
    private int age;
    private String address;
    private String phone;
    private String email;
    private int height;
    private int weight;

    public Person(String name, int age, String phone, String email, int height, int weight) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.height = height;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // smell: Primitive Obsession
    public void setAddress(String address){
        this.address = address;
    }
}