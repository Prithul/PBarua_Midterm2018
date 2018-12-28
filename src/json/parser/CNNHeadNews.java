package json.parser;

public class CNNHeadNews {

    private String id;
    private String name;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publisherAt;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrL() {
        return url;
    }

    public void setUrL(String urL) {
        this.url = urL;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublisherAt() {
        return publisherAt;
    }

    public void setPublisherAt(String publisherAt) {
        this.publisherAt = publisherAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public CNNHeadNews(){
    }
    public CNNHeadNews(String id, String name, String author, String title, String description, String url, String urlToImage, String publisherAt, String content){
        this.id = id;
        this.name=name;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publisherAt = publisherAt;
        this.content = content;
    }

    public CNNHeadNews(String author, String title, String description, String url, String urlToImage, String publisherAt, String content){
        this.id = id;
        this.name=name;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publisherAt = publisherAt;
        this.content = content;
    }

}

