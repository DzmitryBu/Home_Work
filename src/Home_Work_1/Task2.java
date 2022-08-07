package Home_Work_1;

public class Task2 {
    public static void main(String[] args) {
        int a, b, c;
        c = 5 + 2 / 8;
        System.out.println("1. Результат выражения (5 + 2 / 8) равен: " + c);
        /* Результат равен 5, т.к. первой выполняется оператор  2/8, за тем
        оператор +. Получаем в ответе целое число 5, т.к. int а - целое число
        и результат не округляется по правилам математики.
         */
        c = (5 + 2) / 8;
        System.out.println("2. Результат выражения ((5 + 2) / 8) равен: " + c);
        /* Результат равен 0, т.к. первыми выполняются операторы в скобках (5+2), за тем
        оператор /. Получаем в ответе 0, т.к. int а и результат не округляется по правилам математики.
         */
        a = 2;
        c = (5 + a++) / 8;
        System.out.println("3. Результат выражения ((5 + 2++) / 8) равен: " + c);
         /* Результат равен 0, т.к. первыми выполняются операторы в скобках (5+a++),
         берем значение а(2), получаем (5+2),за тем значение а увеличивается на 1 (становится 3).
         Получаем выражение 7/8, в переменной а находится значение 3.
         Получаем в ответе 0, т.к. int а = 7/8 и результат не округляется по правилам математики.
         */
        a = 2;
        b = 8;
        c = (5 + a++) / --b;
        System.out.println("4. Результат выражения ((5 + 2++) / --8) равен: " + c);
         /*Результат равен 1, т.к. первыми выполняются операторы в скобках (5+a++),
         берем значение а(2), получаем (5+2),за тем значение а увеличивается на 1 (становится 3).
         Следующим действием выполняется преунарный оператор --8 и получаем 7 в переменной b.
         Получаем выражение 7/7. Получаем в ответе 1.
         */
        a = 2;
        b = 8;
        c = (5 * 2 >> a++) / --b;
        System.out.println("5. Результат выражения ((5 * 2 >> 2++) / --8) равен: " + c);
         /*Результат равен 0, т.к. первыми выполняются операторы в скобках (5 * 2 >> a++),
         берем значение а(2), получаем (5 * 2 >> 2),за тем значение а увеличивается на 1 (становится 3).
         >> 2 - побитовый сдвиг вправо на 2 позиции. 2 в двоичной системе 0010 >> 2, получаем 0000,
         что является числом 0, получаем выражение 0/--b. Следующим действием выполняется
         преунарный оператор --8 и получаем 7 в переменной b. Получаем выражение 0/7. Получаем в ответе 0.
         */
        a = 2;
        b = 8;
        c = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        System.out.println("6. Результат выражения ((5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8) равен: " + c);
         /*Результат равен 1, т.к. первыми выполняются операторы в скобках (5 + 7 > 20 ? 68 : 22 * 2 >> a++),
         берем значение а(2), получаем (5 + 7 > 20 ? 68 : 22 * 2 >> 2),за тем значение а увеличивается на 1.
         Затем выполняется умножение 22 * 2, получаем 44 >> 2. >> 2 - побитовый сдвиг вправо на 2 позиции.
         44 в двоичной системе 0010_1100 >> 2, получаем 0000_1011, что является числом 11,
         получаем выражение (5 + 7 > 20 ? 68 : 11) / --b. Далее выполняется слажение, получаем (12 > 20 ? 68 : 11),
         за тем сравнение, получаем (false ? 68 : 11) и должно возвратиться выражение 2 (т.е. 11).
         Таким образом получаем выражение 11 / --b. Следующим действием выполняется
         преунарный оператор --8 и получаем 7 в переменной b. Получаем выражение 11/7. Получаем в ответе 1.
         т.к. int а - целое число и результат не округляется по правилам математики.
         */
        a = 2;
        b = 8;
//      c = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b; не может быть скопилирован
//      System.out.println("7. Результат выражения ((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8) равен: " + c);
         /*Не скомпилируется, т.к. тернарный оператор возвращает выражение до ":", если условие  до "?"
         true и возвращает выражение после ":", если условие  до "?" false. В выражении до ":", в результате
         мы получаем true тип boolean, на выходе из ветки false тип int. Далее у нас еще есть деление
         на целочисленный тип данных (int). Компилятору видит, что возможна арифметическая операция с boolean .
         */
        boolean d;
        d = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println("8. Результат выражения (6 - 2 > 3 && 12 * 12 <= 119) равен: " + d);
        /*Результат равен false, т.к. первыми выполняются умножения и вычитания.
        Получаем выражение (4 > 3 && 144 <= 119). Затем выполняются операции сравнения.
        Далее выполняем логический оператор И (умножение). Получаем true && false, что в результате дает false.
         Получаем в ответе false.
         */
        boolean f;
        f = true && false;
        System.out.println("9. Результат выражения (true && false) равен: " + f);
        /* Результат равен false. Выполняем логический оператор И (умножение). В результате дает false.
         Получаем в ответе false.
         */
    }
}