package observer;

public class Second implements Observer {
    private Publisher publisher;
    private String contents;

    public Second(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String contents) {
        this.contents = contents;
        System.out.println("변경된 신문사의 내용 (Second) : " + this.contents);
    }
}
