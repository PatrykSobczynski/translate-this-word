package com.sobczynski.learn_english.Service;

import com.sobczynski.learn_english.model.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TranslateServiceImpl implements TranslateService {

    List<Word> wordList;

    public TranslateServiceImpl() {
        addWords();
    }

    @Override
    public List<Word> displayWords(){
        return wordList;
    }

    @Override
    public Word findRandomWord() {
        Random r = new Random();
        return wordList.stream().skip(r.nextInt(wordList.size())).findAny().get();
    }

    @Override
    public Word findWordById(Long id) {
        return wordList.stream().filter(word -> word.getId().equals(id)).findAny().get();
    }

    @Override
    public void updateAnswer(Word word, String answer) {
        word.setAnswer(answer);
    }

    @Override
    public void addWords() {
        wordList = new ArrayList<>();

        wordList.add(new Word(1L, "dodawać", "add"));
        wordList.add(new Word(2L, "wiek", "age"));
        wordList.add(new Word(3L, "sztuka", "art"));
        wordList.add(new Word(4L, "nadzieja", "hope"));
        wordList.add(new Word(5L, "przyjaźń", "friendship"));
        wordList.add(new Word(6L, "książka", "book"));
        wordList.add(new Word(7L, "uczucie", "feeling"));
        wordList.add(new Word(8L, "pamięć", "memories"));
        wordList.add(new Word(9L, "sentyment", "sentiment"));
        wordList.add(new Word(10L, "pies", "dog"));
        wordList.add(new Word(11L, "analiza", "analyze"));
        wordList.add(new Word(12L, "ostry", "incisive"));
        wordList.add(new Word(13L, "niezależny", "independent / maverick"));
        wordList.add(new Word(14L, "kwaśny", "acid"));
        wordList.add(new Word(15L, "powietrze", "air"));
        wordList.add(new Word(16L, "odpowiedź", "answer"));
        wordList.add(new Word(17L, "mrówka", "ant"));
        wordList.add(new Word(18L, "garnek", "pot"));
        wordList.add(new Word(19L, "zysk", "profit"));
        wordList.add(new Word(20L, "ciągnąć", "pull"));
        wordList.add(new Word(21L, "jakość", "quality"));
        wordList.add(new Word(22L, "szczur", "rat"));
        wordList.add(new Word(23L, "czytać", "read"));
        wordList.add(new Word(24L, "powód", "reason"));
        wordList.add(new Word(25L, "nagrywać", "record"));
        wordList.add(new Word(26L, "gwałtowny", "sudden"));
        wordList.add(new Word(27L, "powierzchnia", "surface"));
        wordList.add(new Word(28L, "pływać", "swim"));
        wordList.add(new Word(29L, "ogon", "tail"));
        wordList.add(new Word(30L, "cienki", "thin"));
        wordList.add(new Word(31L, "tysiąc", "thousand"));
        wordList.add(new Word(32L, "gardło", "throat"));
        wordList.add(new Word(33L, "kciuk", "thumb"));
        wordList.add(new Word(34L, "bilet", "ticket"));
        wordList.add(new Word(35L, "język - część ciała", "tongue"));
        wordList.add(new Word(36L, "zwrotka", "verse"));
        wordList.add(new Word(37L, "samogłoska", "vowel"));
        wordList.add(new Word(38L, "młody", "young"));
        wordList.add(new Word(39L, "wysoki", "high"));
        wordList.add(new Word(40L, "dziura", "hole"));
        wordList.add(new Word(41L, "galaretka", "jelly"));
        wordList.add(new Word(42L, "dołączyć", "join"));
        wordList.add(new Word(43L, "chemiczny", "chemical"));
        wordList.add(new Word(44L, "broda, podbródek", "chin"));
        wordList.add(new Word(45L, "kościół", "church"));
        wordList.add(new Word(46L, "koło", "circle"));
        wordList.add(new Word(47L, "zegar", "clock"));
        wordList.add(new Word(48L, "płaszcz", "coat"));
        wordList.add(new Word(49L, "kołnierz", "collar"));
        wordList.add(new Word(50L, "grzebień", "comb"));
        wordList.add(new Word(51L, "zwykły, pospolity", "common"));
        wordList.add(new Word(52L, "kompletny", "complete"));
        wordList.add(new Word(53L, "warunek", "condition"));
        wordList.add(new Word(54L, "kucharz", "cook"));
        wordList.add(new Word(55L, "kopia", "copy"));
    }
}
