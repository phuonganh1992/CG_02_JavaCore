public class Person {
    private String name;
    private int age;
    private String career;
    private String id;

    public Person() {
    }

    public Person(String name, int age, String career, String id) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
