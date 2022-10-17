package Home_Work_6.decorator;

import Home_Work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer extends ISearchEngineDecorator{

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        super(iSearchEngine);
    }

    public String replacePunct(String text){
        return text.replaceAll("\\p{Punct}", "");
    }

    public String replacePoint(String text){
        return text.replaceAll("\\.", " ");
    }

    public String replaceN(String text){
        return text.replaceAll("\\n", " ");
    }
}
