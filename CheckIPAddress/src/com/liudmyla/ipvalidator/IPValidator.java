import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {
    private String ipV4;

    public IPValidator(String ipV4) {
        this.ipV4 = ipV4;
    }

    public boolean isIPv4AddressValid() {
        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        Pattern p = Pattern.compile(regex);

        if (ipV4 == null) {
            return false;
        }

        Matcher m = p.matcher(ipV4);
        return m.matches();
    }

    public boolean isIPAddressBlackListed() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\projects\\CheckIPAddress\\BlackList.txt"));
        while (in.ready()) {
            String str = in.readLine();
            if (ipV4.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
