
class Person {
    public String name;
    private int age;
    private String address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // smell: Primitive Obsession
    public void setAddress(String address){
        this.address = address;
    }
}