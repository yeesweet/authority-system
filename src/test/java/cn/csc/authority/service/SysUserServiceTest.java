package cn.csc.authority.service;

import java.util.List;

import javax.annotation.Resource;

import cn.csc.authority.entity.SysUserEntity;

/**
 * 系统用户测试
 * 
 * @author zhang.hp
 *
 *
 */
public class SysUserServiceTest {

	@Resource
	private SysUserService sysUserService;

	/**
	 * 查询列表
	 */
	// @Test
	public void selectList() {
		List<SysUserEntity> selectList = sysUserService.selectList(null);
		for (SysUserEntity sysUserEntity : selectList) {
			System.out.println(sysUserEntity);
		}
	}

}
