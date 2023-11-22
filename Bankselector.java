public class Bankselector {
    public static String getSelectedBank(String choice) {
        if ("SBI".equals(choice)) {
            System.out.println("Processing payment with SBI.");
            return "SBI";
        } else if ("HDFC".equals(choice)) {
            System.out.println("Processing payment with HDFC.");
            return "HDFC";
        } else if ("Union".equals(choice)) {
            System.out.println("Processing payment with Union.");
            return "Union";
        } else {
            System.out.println("No Selected Bank.");
            return "Invalid choice";
        }
    }

}
