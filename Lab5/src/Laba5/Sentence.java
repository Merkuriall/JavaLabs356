package Laba5;
import java.util.ArrayList;

public class Sentence {
    private String sent;
    private Word[] words;
    private ArrayList<Punctuation> p;

    public Sentence(String a, char s) {
        setSent(a + s);
        ArrayList<Punctuation> p1 = new ArrayList<Punctuation>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ',' || a.charAt(i) == ';' || a.charAt(i) == ':'
                    || a.charAt(i) == '-') {
                p1.add(new Punctuation(a.charAt(i), i));
            }
        }
        p1.add(new Punctuation(s, a.length()));
        p = p1;
        String sent1[] = a.split("[,-:;]\\s|\\s[,-:;]|[,-:;]|\\s");
        int k = 0;
        for (int i = 0; i < sent1.length; i++) {
            if (sent1[i].isEmpty()) {
                k++;
            }
        }
        this.words = new Word[sent1.length - k];
        for (int i = 0, j = 0; i < sent1.length; i++) {
            if (!sent1[i].isEmpty()) {
                words[j] = new Word(sent1[i]);
                j++;
            }
        }
    }

    public String getSent() {
        return new String(sent);
    }

    public void setSent(String sent) {
        this.sent = new String(sent);
    }

    public Word[] getWords() {
        return words.clone();
    }

    public void setWord(Word[] word) {
        this.words = word.clone();
    }

    public ArrayList<Punctuation> getP() {
        return new ArrayList<Punctuation>(p);
    }

    public void setP(ArrayList<Punctuation> p) {
        this.p = new ArrayList<Punctuation>(p);
    }

}

