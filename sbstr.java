public class sbstr {

    public static void mysubstr(String input,int a,int b) {
        //даны переменные: строка, начальная позиция, конечная позиция
        String newstr = input;
        int start = a;
        int finish = b;

        int i = newstr.length();
        for (int j = start; j < finish; j++) {
            char newletter = newstr.charAt(j);
            System.out.print (newletter);
        }
    }
}
