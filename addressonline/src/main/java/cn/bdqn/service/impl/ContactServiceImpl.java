package cn.bdqn.service.impl;


import cn.bdqn.dao.ContactMapper;
import cn.bdqn.pojo.Contact;
import cn.bdqn.service.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("")
public class ContactServiceImpl implements ContactService {
    @Resource
    private ContactMapper contactMapper;

    @Override
    public List<Contact> findContacts(String cname, Integer currNo, Integer pageSize) {
        return contactMapper.findContacts("%"+cname+"%",(currNo-1)*pageSize,pageSize);
    }

    @Override
    public int count(String cname) {
        return contactMapper.findContacts("%"+cname+"%",null,null).size();
    }

}
