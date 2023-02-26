import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String userMessage = "";
        do {
            System.out.println("Enter IPv4 address or quit to exit: ");
            Scanner in = new Scanner(System.in);
            userMessage = in.nextLine();

            if (userMessage.equals("quit")) {
                break;
            }
            String ipAddress = userMessage;
            IPValidator ipValidator = new IPValidator(ipAddress);
            if (!ipValidator.isIPv4AddressValid()) {
                System.out.println("Invalid IPv4 address");
                continue;
            }

            System.out.println("Valid IPv4 address");
            if (!ipValidator.isIPAddressBlackListed()) {
                System.out.println("Access disallowed");
            } else {
                System.out.println("Access allowed");
            }

        } while (!userMessage.equals("quit"));
    }


}
