public class reverse {
    public static void main(String[] args) {
        String newstr = "hello";
        System.out.println(newstr);
        int i = newstr.length();
            for (int j = i-1; j >= 0; j--) {
                char newletter = newstr.charAt(j);
                System.out.print(newletter);
        }
    }
}
