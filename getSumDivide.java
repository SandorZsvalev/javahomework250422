public class getSumDivide {
    public static void getSumDivisibleByTreeNumbers (int a,int b) {
        int num1=a;
        int num2=b;
         while (num1<=num2 && num2%3!=0) {
             num2--;}
         //проверяем, делится ли второе число на три без остатка.
         // Если нет, уменьшаем второе число на единицу, пока не найдем то, которое делится
         // Или пока второе число не станет равно первому
        int result=0;
        // найдя нужное число, объявляем переменную для хранения результирующей суммы
        while (num1<=num2) {
            // запускаем цикл для суммирования всех кратных трем чисел в интервале. Проверяем, входит ли число в интервал
            result=result+num2;
            // прибавляем найденное кратное трем число к результату
            num2=num2-3;
            // переходим к следующему кратному трем числу
        }
        System.out.println("The sum of all numbers between "+a+" and "+b+" that divisible by 3 is "+result);
    }
}
