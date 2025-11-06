package _35_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = Arrays.asList(
                new Product("삼성 갤럭시북3 프로", 1850000),
                new Product("삼성 갤럭시북 이온", 1350000),
                new Product("삼성 갤럭시탭 S9", 950000),
                new Product("삼성 갤럭시 S24 울트라", 1590000),
                new Product("애플 맥북에어 M2", 1690000),
                new Product("애플 맥북프로 M3", 2490000),
                new Product("애플 아이패드 에어 5세대", 929000),
                new Product("애플 아이폰 15 프로", 1550000),
                new Product("LG 그램 17", 2190000),
                new Product("LG 울트라PC", 1140000)
        );
        System.out.println("브랜드 명을 입력하세요: ");
        String BrandName = scanner.nextLine();

        System.out.println("최대 가격을 입력하세요: ");
        int maxprice = scanner.nextInt();

        System.out.println("[ 필터링 결과 ]");
        List<Product> filtered = products.stream()
                .filter(product -> product.getName().contains(BrandName))
                .filter(product -> product.getPrice() <= maxprice)
                .toList();
        if (filtered.isEmpty()) {
            System.out.println("해당조건만족 제품 없음");
        } else {
            filtered.forEach(System.out::println);
        }


    }
}
