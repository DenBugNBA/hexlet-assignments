package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;


// BEGIN
class App {
    public static  List<Map<String, String >>  findWhere(List<Map<String, String >> booksList, Map<String, String> bookData) {
        List <Map<String, String >> resultList = new ArrayList<>();

        for (Map<String, String > book : booksList) {
            boolean flag =true;

            for (Map.Entry <String, String> entry : bookData.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                if (!book.get(key).equals(value)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                resultList.add(book);
            }
        }

        return resultList;
    }
}
//END
