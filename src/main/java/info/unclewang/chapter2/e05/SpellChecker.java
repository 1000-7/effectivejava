package info.unclewang.chapter2.e05;


/**
 * 最简单的依赖注入，Spring容器，通过@AutoWired即可实现依赖注入
 */
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return false;
    }
}
