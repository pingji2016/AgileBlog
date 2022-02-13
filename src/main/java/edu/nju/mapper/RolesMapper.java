package edu.nju.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import edu.nju.bean.Role;

import java.util.List;

/**
 * Created by agile group on 2022/1/17.
 */
@Mapper
public interface RolesMapper {
    int addRoles(@Param("roles") String[] roles, @Param("uid") Long uid);

    List<Role> getRolesByUid(Long uid);
}
