package Labs.lab17_CreativityCheck;

import java.util.Scanner;

/*"Анализ Креативности Текста.
        Подсчитать количество слов и букв в строке. Слово - это последовательность символов, разделенных одним или
        несколькими символами-разделителями. Буква - это символ, не являющийся разеделителем.
        Разделители слов: пробел, табуляция, перевод каретки, знаки препинания. Полный список: "",.!?:;()""
        Нельзя использовать для разбора строки класс StringTokenizer, String.split(), substring() и подобные им.
        В программе нельзя использовать вложенные циклы. Так же не рекомендуется использовать метод String.indexOf().
        Программа не должна создавать дополнительные строки сравнимого размера с введенной строкой.
        Программа должна проходить тест на следующих данных:
        1) "    xxx,    xx x   x"
        2) "xxxxxxx"
        3) "xxxxxxx.    "
        4) "xxx,xxxx"
        5) "xxx,xxxx"
        6) "........"
        7) "... xxx...  "
        8) "" - пустая строка"*/
public class CreativityCheck {

    public static void main(String[] args) {
        int letterCount = 0;
        int wordsCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your text here:");
        String text = sc.nextLine();
        System.out.println("Your text is here");
        boolean isDiv = true; // нашли разделитель слов
        boolean isLetter; // нет букв


        // найти все буквы и слова

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == ',' || text.charAt(i) == '.' || text.charAt(i) == '!'
                    || text.charAt(i) == '?' || text.charAt(i) == ':' || text.charAt(i) == ';' || text.charAt(i) == '('
                    || text.charAt(i) == ')' || text.charAt(i) == '"') {
                isDiv = true;
                isLetter = false;
            } else {
                isLetter = true;
                letterCount++;
            } // считаем количество слов (слово - это либо там, где есть пробел либо там, где есть другой знак
            if (isLetter && isDiv) {
                wordsCount++;
                isDiv = false;
            }
        }
        System.out.println("Количество слов = " + wordsCount);
        System.out.println("Количество букв = " + letterCount);
    }
}
