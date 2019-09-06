package cn.xtrui.mbp.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

@Data
@AllArgsConstructor
@TableName("books")
public class Book extends Model<Book> {
    @TableId
    String bookid;
    String author;
    Integer price;
    String publisher;
    String title;

    public Book() {

    }
}
