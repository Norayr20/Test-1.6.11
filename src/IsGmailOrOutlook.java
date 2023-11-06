public class IsGmailOrOutlook {
    public static void main(String[] args) {
        String email1 = "kata12@gmail.com";
        boolean IsGmailOrOutlooked = isGmailOrOutlook(email1);
        String email2 = "@outlook.com";
        boolean IsGmailOrOutlook = isGmailOrOutlook(email2);
    }
    public static boolean isGmailOrOutlook(String email) {
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }

        String domain = parts[1].toLowerCase();
        return domain.equals("gmail.com") || domain.equals("outlook.com");
    }
}