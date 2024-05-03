class Main {
    private int age;
    int name;

    public int getAge() {

        return age;
    }

    public void setAge(int x) {

        age = x;
    }

}

class Encapsulation {
    public static void main(String[] args) {
        Main m = new Main();
        // m.age =20;
        m.setAge(23);
        System.out.println(m.getAge());
        // m.setAge(23);
    }
}