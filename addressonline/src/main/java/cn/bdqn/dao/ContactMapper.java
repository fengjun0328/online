package cn.bdqn.dao;

import cn.bdqn.pojo.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactMapper {
    List<Contact> findContacts(@Param("cname") String cname,
                               @Param("start") Integer start,
                               @Param("pageSize") Integer pageSize);
}
