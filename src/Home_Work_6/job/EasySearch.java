package Home_Work_6.job;

import Home_Work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
//    @Override
    public long search2(String text, String word) {
        long count = 0;

        int index = -1;
        String[]simbol = {" ",".","?",",","!", "..", "...", ";", ":", " -", "--", "*", "'", "\"", "(", ")"};
        for (int i = 0; i < simbol.length; i++){
            for (int j = 0; j < simbol.length; j++) {
                boolean flag = true;
                while (flag) {

                        index = text.indexOf((simbol[i] + word + simbol[j]), index + 1);
                    if (index != -1) {
                        count++;
                    } else {
                        flag = false;
                    }
                }
                index = -1;
            }
        }
        return count;
    }


    @Override
    public long search(String text, String word) {
        int index = 0;
        long count = 0;

        String[]firstSimbol = {" ",".","?",",","!", "..", "...", ";", ":", " -", "--", "*", "'", "\"", "(", ")"};
        String[]lastSimbol = {" ","\n",".","?",",","!", "..", "...", ";", ":", "--", "*", "'", "\"", "(", ")"};
        if(text.startsWith(word) && text.endsWith(word) && (word.length() == text.length())){
            count++;
        }
        for (int i = 0; i < lastSimbol.length; i++){
            if(text.indexOf((word + lastSimbol[i]), (index)) == 0){
                count++;
            }
            for (int j = 0; j < firstSimbol.length; j++){
                boolean flag = true;
                while (flag){
                    if((index = text.indexOf((firstSimbol[j] + word + lastSimbol[i]), (index + 1))) != 0 &&
                            text.indexOf((firstSimbol[j] + word + lastSimbol[i]), (index + 1)) != -1){
                        count++;
                    }
                    if (index == -1){
                        flag = false;
                    }
                }
            }
        }
        for (int j = 0; j < firstSimbol.length; j++){
            if(text.endsWith(firstSimbol[j] + word)){
                count++;
            }
        }
        return count;
    }
}
