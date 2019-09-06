package cn.xtrui.mbp.servicelmp;

import cn.xtrui.mbp.bean.Books;
import cn.xtrui.mbp.mapper.BooksMapper;
import cn.xtrui.mbp.service.BooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tianrui
 * @since 2019-07-11
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

}
