public class IsGmailOrOutlook {
    public static void main(String[] args) {
        String email1 = "kata12@gmail.com";
        System.out.println(email1 + " is Gmail or Outlook: " + isGmailOrOutlook(email1));
    }

    public static boolean isGmailOrOutlook(String email) {
        String cleanEmail = email.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (cleanEmail.endsWith("gmailcom")) {
            return true;
        } else if (cleanEmail.endsWith("outlookcom")) {
            return true;
        } else {
            return false;
        }
    }
}