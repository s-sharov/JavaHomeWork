package HomeWork02;

import org.json.JSONObject;

public class Task1 {

    /*"""""1. Дана строка sql-запроса "select * from students where ".
    Сформируйте часть WHERE этого запроса, используя StringBuilder.
    Данные для фильтрации приведены ниже в виде json-строки.
            Если значение null, то параметр не должен попадать в запрос.
    Пример 1:
    Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
    Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
    Пример 2:
    Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
    Результат: SELECT * FROM USER;*/
    public static void init() {
        JSONObject params = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":null}");
        System.out.println(params);
        System.out.println(getQuery(params));

    }

    public static String getQuery(JSONObject params) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM USER WHERE: ");
        for (String key: params.keySet()) {
            if(!params.isNull(key)) {
                stringBuilder.append(key).append(" = '").append(key).append("' and ");
            }
        }
        stringBuilder.delete(stringBuilder.toString().length()-5, stringBuilder.toString().length());
        return stringBuilder.toString();
    }

}
