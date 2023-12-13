public class objectFieldMethodd {
    public static void main(String[] args) {

        sayHello("Edi"," Joni");
        sayAddres("Sketbord", "Skydiv");

    }

    static void sayHello( String firstName , String lastName ){
        System.out.println("Hello " +firstName+ " My Name is " +lastName);
    }

    static void sayAddres( String paraHobby , String whyHoby ){
        System.out.println("Hoby saya " +paraHobby+ " Apa Hoby kamu " +whyHoby);
    }


}
