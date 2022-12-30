package Laba5;

public class Text {
    private String txt;
    private Sentence[] sentence;

    public Text(String s) {
        String s1 = s.replaceAll("\\s+", " ");
        setTxt(s1);
        ;
        String sent1[] = s1.split("\\.|!|\\?");
        this.sentence = new Sentence[sent1.length];
        int z = 0;
        for (int i = 0; i < sent1.length; i++) {
            z = z + sent1[i].length();
            sentence[i] = new Sentence(sent1[i], s1.charAt(z + i));
        }
    }

    public String getTxt() {
        return new String(txt);
    }

    public void setTxt(String txt) {
        this.txt = new String(txt);
    }

    public Sentence[] getSentence() {
        return sentence.clone();
    }

    public void setSentence(Sentence[] sentence) {
        this.sentence = sentence.clone();
    }

}
