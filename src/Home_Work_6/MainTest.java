package Home_Work_6;

import Home_Work_6.job.RegExSearch;

public class MainTest {
    public static void main(String[] args) {
        Convertion text = new Convertion();


        RegExSearch temp = new RegExSearch();
        System.out.println(temp.search("а па ар ав . а", "а"));
    }
}
