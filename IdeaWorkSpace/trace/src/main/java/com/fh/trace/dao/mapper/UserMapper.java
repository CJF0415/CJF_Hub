package com.fh.trace.dao.mapper;

import com.fh.trace.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    /**
     * @return
     */
    List<User> queryAllUsers();

    /**
     * @param list
     * @return
     */
    int insertUser(List<User> list);

}
