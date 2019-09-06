package cn.xtrui.mbp.servicelmp;

import cn.xtrui.mbp.bean.Customer;
import cn.xtrui.mbp.mapper.CustomerMapper;
import cn.xtrui.mbp.service.CustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
