package Home_Work_6.decorator;

import Home_Work_6.api.ISearchEngine;
import Home_Work_6.job.EasySearch;
import Home_Work_6.job.RegExSearch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseIgnoreDecorator extends ISearchEngineDecorator{
   private ISearchEngine iSearchEngine;
    public CaseIgnoreDecorator(ISearchEngine iSearchEngine) {
        super(iSearchEngine);
        this.iSearchEngine = iSearchEngine;

    }
    @Override
    public long search(String text, String word) {
        if(iSearchEngine instanceof EasySearch){
            return super.search(text.toLowerCase(),word.toLowerCase());
        }
        if(iSearchEngine instanceof RegExSearch){
//            long count = 0;
//            Pattern patern = Pattern.compile("\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*"
//                    + word +
//                    "\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*", Pattern.CASE_INSENSITIVE);
//
//            Matcher matcher = patern.matcher(text);
//            boolean flag;
//            while ((flag = matcher.find())){
//                if(flag){
//                    count++;
//                }
//            }
            Pattern patern = Pattern.compile("\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*"
                    + "(?i)(word)" +
                    "\\s*(\\s-|\\s|--|!|\"|;|'|:|\\(|\\)|\\*|,|\\?|\\.)\\s*");
            return super.search(text.toLowerCase(), word.toLowerCase());
        }
        return -1;
    }
}
