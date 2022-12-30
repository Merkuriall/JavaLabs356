package Laba5;

public class Word {
    private String word;
    private Letter[] letters;

    public Word(String a) {
        setWord(a);
        this.letters = new Letter[a.length()];
        for (int i = 0; i < a.length(); i++) {
            letters[i] = new Letter(a.charAt(i));
        }
    }

    public String getWord() {
        return new String(word);
    }

    public void setWord(String word) {
        this.word = new String(word);
    }

    public Letter[] getLetters() {
        return letters.clone();
    }

    public void setLetters(Letter[] letter) {
        this.letters = letter.clone();
    }

}

