package cn.xtrui.mbp;

import cn.xtrui.mbp.bean.Book;
import cn.xtrui.mbp.bean.Books;
import cn.xtrui.mbp.mapper.BookMapper;
import cn.xtrui.mbp.mapper.BooksMapper;
import cn.xtrui.mbp.service.BooksService;
import cn.xtrui.mbp.servicelmp.BooksServiceImpl;
import cn.xtrui.mbp.temp.HttpUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;

@RunWith(SpringRunner.class)

@SpringBootTest
public class MbpApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BooksMapper booksMapper;
    @Autowired
    BooksService booksService;








    @Test
    public void contextLoads() {
        System.out.println(bookMapper.selectById(3));

        IPage<Books> booksIPage = booksMapper.selectPage(new Page<>(1,1),null);
        System.out.println(booksIPage.getRecords());


    }

    @Test
    public void mytest(){


    }



}
