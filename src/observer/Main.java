package observer;

public class Main {
    public static void main(String[] args) {
        NewsCompany newsCompany = new NewsCompany();

        First first = new First(newsCompany);
        Second second = new Second(newsCompany);

        newsCompany.setNewsTitle("초 대박 뉴스!!!!");
        System.out.println("-----------");
        newsCompany.setNewsTitle("초초초 대박 뉴스!!!!");

        first.unsubscribe();

        System.out.println("First 구독 취소 후,,,,,,,");
        newsCompany.setNewsTitle("나쁜 내용의 뉴스");
    }
}
