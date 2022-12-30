package Laba5;
public class Lab5 {

    public static void removeOfString(Text t, Letter a, Letter b) {
        boolean k = true;
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < t.getSentence().length; i++) {
            int a1 = t.getSentence()[i].getSent().indexOf(a.getLetter());
            int b1 = t.getSentence()[i].getSent().lastIndexOf(b.getLetter());
            if (a1 != -1 && b1 != -1) {
                s.append(t.getSentence()[i].getSent().substring(0, a1)
                        + t.getSentence()[i].getSent().substring(b1 + 1));
                k = false;
            } else {
                s.append(t.getSentence()[i].getSent());
            }
        }
        if (k) {
            System.out.println("В данной строке не найдено заданых символов.");
        } else {
            Text t1 = new Text(s.toString());
            System.out.println("Вы ввели текст:" + "\n" + t.getTxt());
            System.out.println("Отредактированный текст:");
            System.out.println(t1.getTxt());
        }
    }

    public static void main(String[] args) {
        String s = "Толкин подготовил несколько карт Средиземья и отдельных его областей, "
                + "где проходят события его            произведений! Не все они были опубликованы "
                + "при жизни.";
        Text b = new Text(s);
        Letter a = new Letter('н');
        Letter k = new Letter('й');
        removeOfString(b, a, k);
    }
}
