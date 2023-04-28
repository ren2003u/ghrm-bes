package cn.vcorp.ghrm.emp.mapper;

import cn.vcorp.ghrm.common.annotation.DataSource;
import cn.vcorp.ghrm.common.enums.DataSourceType;
import cn.vcorp.ghrm.emp.domain.Education;

import java.util.List;
/**
 * 学历编码Mapper接口
 * 
 * @author administrator
 * @date 2023-04-27
 */
@DataSource(DataSourceType.SLAVE)
public interface EducationMapper
{
    /**
     * 查询学历编码
     * 
     * @param eduId 学历编码ID
     * @return 学历编码
     */
    public Education selectEducationById(String eduId);

    /**
     * 查询学历编码列表
     * 
     * @param education 学历编码
     * @return 学历编码集合
     */
    public List<Education> selectEducationList(Education education);

    /**
     * 新增学历编码
     * 
     * @param education 学历编码
     * @return 结果
     */
    public int insertEducation(Education education);

    /**
     * 修改学历编码
     * 
     * @param education 学历编码
     * @return 结果
     */
    public int updateEducation(Education education);

    /**
     * 删除学历编码
     * 
     * @param eduId 学历编码ID
     * @return 结果
     */
    public int deleteEducationById(String eduId);

    /**
     * 批量删除学历编码
     * 
     * @param eduIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteEducationByIds(String[] eduIds);
}
