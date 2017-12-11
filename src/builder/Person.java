package builder;

/**
 * Created by NeverForgive on 2017-12-11.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String country;


    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.country = builder.country;
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static final class Builder{

        private String firstName;
        private String lastName;
        private int age;
        private String country;

        private Builder(){

        }

        public Builder firstName(String firstName){
            this.firstName = firstName;

            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;

            return this;
        }

        public Builder age(int age){
            this.age = age;

            return this;
        }

        public Builder country(String country){
            this.country = country;

            return this;
        }


        public Person build(){

            return new Person(this);
        }

    }
}
