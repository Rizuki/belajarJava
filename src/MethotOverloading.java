public class MethotOverloading {
    public static void main(String[] args) {
        sayHello("edi");
        sayHello("edi","budi");
    }

    private static void sayHello(String name) {
        System.out.println("halo " + name);
    }

    private static void sayHello(String name, String lastName) {
        System.out.println("halo " + name + " saya " + lastName);
    }
}
