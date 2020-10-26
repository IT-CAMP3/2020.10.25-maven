import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String pass = "admin";
        String hashedPass = DigestUtils.md5Hex(pass);

        System.out.println(hashedPass);
    }
}
