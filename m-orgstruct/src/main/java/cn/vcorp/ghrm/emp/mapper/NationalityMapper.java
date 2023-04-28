package cn.vcorp.ghrm.emp.mapper;

import cn.vcorp.ghrm.common.annotation.DataSource;
import cn.vcorp.ghrm.common.enums.DataSourceType;
import cn.vcorp.ghrm.emp.domain.Nationality;

import java.util.List;

/**
 * 国籍Mapper接口
 * 
 * @author administrator
 * @date 2023-04-26
 */
@DataSource(DataSourceType.SLAVE)
public interface NationalityMapper 
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
     * 删除国籍
     * 
     * @param nationId 国籍ID
     * @return 结果
     */
    public int deleteNationalityById(String nationId);

    /**
     * 批量删除国籍
     * 
     * @param nationIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNationalityByIds(String[] nationIds);
}
