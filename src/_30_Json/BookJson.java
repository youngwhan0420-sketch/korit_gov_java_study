//package _30_Json;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonObject;
//import lombok.AllArgsConstructor;
//import lombok.ToString;
//
//import java.util.Map;
//
//// Book클래스 만들고 객체 생성
//// isbn, title, author, price, publisher => String으로 필드를 잡아준다.
//// "978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
//// Book객체 => Json문자열
//// Json => Map
//// Map => pretty Json
//// Json => Book객체
//@AllArgsConstructor
//@ToString
//
//class Book {
//    private String isbn;
//    private String title;
//    private String author;
//    private String price;
//    private String publisher;
//}
//public class BookJson {
//    public static void main(String[] args) {
//
//        Gson gson = new Gson();
//        Gson gsonbuilder = new GsonBuilder().setPrettyPrinting().
//        Book book = new Book("978-1234567890", "자바의 정석", "낭궁성", " 38000", "도우출판");
//        userJson = gson.toJson(book);
//
//        Map<String, String> bookMap = gson.fromJson(userJson, Map.class);
//        System.out.println("Map => Pretty Json");
//        System.out.println(bookMap);
//
//        String prettyJsonFromMap = gsonBuilder.toJason(bookMap);
//        System.out.println();
//        System.out.println(prettyJsonFromMap);
//
//        Book parsedBook = gson.fromJson(jsonBook, Book.class);
//        System.out.println(parsedBook);
//    }
//}
