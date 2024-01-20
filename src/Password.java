import java.io.Console;

public class Password {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available!");
            System.exit(1);
        }

        String userName = console.readLine("Username: ");
        char[] passwordArray = console.readPassword("Password: ");

        // Proses login atau pengolahan password lainnya
        if (authenticateUser(userName, new String(passwordArray))) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Hapus data password dari memori
        java.util.Arrays.fill(passwordArray, ' ');
    }

    private static boolean authenticateUser(String userName, String password) {
        // Implementasi autentikasi disini
        // Return true jika autentikasi berhasil, false sebaliknya
        return "user".equals(userName) && "password".equals(password);
    }
}

