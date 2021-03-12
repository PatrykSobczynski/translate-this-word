package com.sobczynski.learn_english.model;

public class Word {
    private Long id;
    private String word;
    private String translateWord;
    private String answer;

    public Word() {
    }

    public Word(Long id, String word, String translateWord) {
        this.id = id;
        this.word = word;
        this.translateWord = translateWord;

    }

    public Word(Long id, String word, String translateWord, String answer) {
        this.id = id;
        this.word = word;
        this.translateWord = translateWord;
        this.answer = answer;
    }

    public String isCorrect() {
        if(answer != null) {
            if (getAnswer().equalsIgnoreCase((getTranslateWord()))) {
                return "Correct";
            }
            return "Try again";
        }
        return "Answer is empty";
    }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getWord() { return word; }
    public void setWord(String word) { this.word = word; }
    public String getTranslateWord() { return translateWord; }
    public void setTranslateWord(String translateWord) { this.translateWord = translateWord; }
}
