package cn.cecurio.ch8_2.service;

import cn.cecurio.ch8_2.domain.User;

import java.util.List;

/**
 * @author: Cecurio
 * @create: 2017-11-11 15:58
 * @desc:
 **/
public interface IUserService {
    List<User> findAll();

    void saveUser(User book);

    User findOne(long id);

    void delete(long id);

    List<User> findByName(String name);
}
