public class Person {
    private String name;
    private String family;
    private Integer age;
    private Education education;
    private Sex sex;

    public Person(String name, String family, Integer age, Education education, Sex sex) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.education = education;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Education getEducation() {
        return education;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", education=" + education +
                ", sex=" + sex +
                '}' + "\n";
    }
}

