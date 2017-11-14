package cn.cecurio.ch8_2.dao;

import cn.cecurio.ch8_2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Cecurio
 * @create: 2017-11-11 15:52
 * @desc:
 * 实际上JpaRepository实现了PagingAndSortingRepository接口，
 * PagingAndSortingRepository接口实现了CrudRepository接口，
 * CrudRepository接口实现了Repository接口；
 **/
public interface UserJpaRepository extends JpaRepository<User,Long> {

}
