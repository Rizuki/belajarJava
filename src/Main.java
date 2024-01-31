class Mahasiswa {
    String name;
    String npm;
    String jurusan;

    Mahasiswa(String name, String npm, String jurusan) {
        this.name = name;
        this.npm = npm;
        this.jurusan = jurusan;
    }

    void show() {
        System.out.println("Nama\t: " + this.name);
        System.out.println("NPM\t: " + this.npm);
        System.out.println("Jurusan\t: " + this.jurusan);
        System.out.println();
    }

    void setName(String name, String npm, String jurusan) {
        this.name = name;
        this.npm = npm;
        this.jurusan = jurusan;
    }

    String getName() {
        System.out.println("Nama yang Diambil adalah : " + this.name);
        return this.name;
    }

    String getNpm() {
        System.out.println("NPM yang Diambil adalah  : " + this.npm);
        return this.npm;
    }

    String getMassage(String massage) {
        return massage + " " + this.name + " How Are You ";
    }

}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Edi", "202243500981", "Teknik informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "20224350098112", "Teknik informatika");
        mahasiswa1.show();
        mahasiswa2.show();
        mahasiswa1.setName("Joko", "202243500982", "Teknik informatika");
        mahasiswa1.show();
        mahasiswa2.getName();
        mahasiswa1.getNpm();
        System.out.println(mahasiswa2.getMassage("Hello"));

    }
}