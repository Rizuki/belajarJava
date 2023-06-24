package java.dasar;

public class ForEach {
    public static void main(String[] args) {

        String [] names = {
                "Edi" , "Irawan"
        };
        for ( var i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }
    }
}
