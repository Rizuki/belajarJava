public class PersonApp {
    public static void main(String[] args) {

        var person1 = new person( "Irawan ", "Jakarta " );

        System.out.println(person1.name);
        System.out.println(person1.addres);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        person person2 = new person("Budi");

        person person3;
        person3 = new person();
        person3.name =" Yono ";
        person3.sayHello("Ucup");



    }
}