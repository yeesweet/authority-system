package cn.csc.authority.dao;

import cn.csc.authority.entity.SysRoleEntity;
import cn.csc.authority.util.BaseDao;

/**
 * 角色管理
 *
 * @author zhang.hp
 *
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 更新角色
     *
     * @param role SysRoleEntity
     */
    void updateNoMapper(SysRoleEntity role);

}
