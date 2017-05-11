package com.github.mykhalechko.epam.task1;


public class Model {
    private String firstWord;
    private String secondWord;

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    // The Program logic

    /**
     * This method creates a phrase from the first word and the second word
     *
     * @return phrase
     */
    public String makePhrase() {
        return firstWord + " " + secondWord;
    }
}
