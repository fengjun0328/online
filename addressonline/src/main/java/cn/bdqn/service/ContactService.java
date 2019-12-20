package cn.bdqn.service;

import cn.bdqn.pojo.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactService {
    List<Contact> findContacts( String cname, Integer currNo, Integer pageSize);
    int count(String cname);

}
