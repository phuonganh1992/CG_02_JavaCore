public class Person {
    private String name;
    private int age;
    private String town;
    private String code;

    public Person() {
    }

    public Person(String name, int age, String town, String code) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.code = code;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
