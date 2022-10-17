package Home_Work_6.decorator;

import Home_Work_6.api.ISearchEngine;

public class ISearchEngineDecorator implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public ISearchEngineDecorator(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text,word);
    }
}
