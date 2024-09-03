import java.util.Scanner;
public class Calculator {
    static int methods(char[] chars, int a, int b, int operand){
        int c;
        if(chars[operand] == '+'){
            c = a + b;
        } else{
            if(chars[operand] == '-'){
                c = a - b;
            } else {
                if(chars[operand] == '/'){
                    c = a / b;
                }
                else {
                    c = a * b;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) throws Exception{
       Scanner s = new Scanner(System.in);
       while (true) {
           System.out.println("введите Ваше выражение");
           String str = s.nextLine();
           try {
               int dl = str.length();
               char[] chars = str.toCharArray();
               int a = 0;
               int b = 0;
               int c = 0;
               if (dl >= 8 || dl <= 4) {
                   throw new Exception("неверный ввод");
               }
               if (dl == 5) {
                   a = Character.getNumericValue(chars[0]);
                   b = Character.getNumericValue(chars[4]);
                   System.out.println("ваш ответ " + methods(chars, a, b, 2));
               }
               if (dl == 6) {
                   if (chars[1] == '0') {
                       a = 10;
                       b = Character.getNumericValue(chars[5]);
                       System.out.println("ваш ответ " + methods(chars, a, b, 3));
                   } else {
                       a = Character.getNumericValue(chars[0]);
                       b = 10;
                       System.out.println("ваш ответ " + methods(chars, a, b, 2));
                   }
               }
               if (dl == 7) {
                   if (chars[6] != 0) {
                       throw new Exception("неверный ввод");
                   } else {
                       a = 10;
                       b = 10;
                       System.out.println("ваш ответ " + methods(chars, a, b, 3));
                   }
               }
           } catch(Exception e) {
               System.err.println("Ошибка: " + e.getMessage());
               break;
               // чтобы после любой ошибки программа завершилась
               //System.exit(1);
           }
       }
       }
}