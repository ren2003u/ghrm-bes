package cn.vcorp.ghrm.emp.service;

import cn.vcorp.ghrm.emp.domain.Nationality;

import java.util.List;

/**
 * 国籍Service接口
 * 
 * @author administrator
 * @date 2023-04-26
 */
public interface INationalityService 
{
    /**
     * 查询国籍
     * 
     * @param nationId 国籍ID
     * @return 国籍
     */
    public Nationality selectNationalityById(String nationId);

    /**
     * 查询国籍列表
     * 
     * @param nationality 国籍
     * @return 国籍集合
     */
    public List<Nationality> selectNationalityList(Nationality nationality);

    /**
     * 新增国籍
     * 
     * @param nationality 国籍
     * @return 结果
     */
    public int insertNationality(Nationality nationality);

    /**
     * 修改国籍
     * 
     * @param nationality 国籍
     * @return 结果
     */
    public int updateNationality(Nationality nationality);

    /**
     * 批量删除国籍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNationalityByIds(String ids);

    /**
     * 删除国籍信息
     * 
     * @param nationId 国籍ID
     * @return 结果
     */
    public int deleteNationalityById(String nationId);
}
