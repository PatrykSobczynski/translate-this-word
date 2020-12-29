package com.sobczynski.learn_english.Service;

import com.sobczynski.learn_english.model.Word;

import java.util.List;

public interface TranslateService {

    Word findRandomWord();

    Word findWordById(Long id);

    void updateAnswer(Word word, String answer);

    void addWords();

    List<Word> displayWords();
}
