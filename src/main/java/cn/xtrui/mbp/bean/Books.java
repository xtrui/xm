package cn.xtrui.mbp.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tianrui
 * @since 2019-07-11
 */
public class Books extends Model<Books> {

    private static final long serialVersionUID=1L;

    private String bookid;

    private String author;

    private Integer price;

    private String publisher;

    private String title;


    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    protected Serializable pkVal() {
        return this.bookid;
    }

    @Override
    public String toString() {
        return "Books{" +
        "bookid=" + bookid +
        ", author=" + author +
        ", price=" + price +
        ", publisher=" + publisher +
        ", title=" + title +
        "}";
    }
}
