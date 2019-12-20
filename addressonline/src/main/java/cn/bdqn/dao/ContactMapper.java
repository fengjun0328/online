package cn.bdqn.dao;

import cn.bdqn.pojo.Contact;

import java.util.List;

public interface ContactMapper {
    List<Contact> findContact(String cname);
}
