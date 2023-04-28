package cn.vcorp.ghrm.emp.service.impl;

import cn.vcorp.ghrm.common.core.text.Convert;
import cn.vcorp.ghrm.emp.domain.Education;
import cn.vcorp.ghrm.emp.mapper.EducationMapper;
import cn.vcorp.ghrm.emp.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 学历编码Service业务层处理
 * 
 * @author administrator
 * @date 2023-04-27
 */
@Service
public class EducationServiceImpl implements IEducationService 
{
    @Autowired
    private EducationMapper educationMapper;

    /**
     * 查询学历编码
     * 
     * @param eduId 学历编码ID
     * @return 学历编码
     */
    @Override
    public Education selectEducationById(String eduId)
    {
        return educationMapper.selectEducationById(eduId);
    }

    /**
     * 查询学历编码列表
     * 
     * @param education 学历编码
     * @return 学历编码
     */
    @Override
    public List<Education> selectEducationList(Education education)
    {
        return educationMapper.selectEducationList(education);
    }

    /**
     * 新增学历编码
     * 
     * @param education 学历编码
     * @return 结果
     */
    @Override
    public int insertEducation(Education education)
    {
        return educationMapper.insertEducation(education);
    }

    /**
     * 修改学历编码
     * 
     * @param education 学历编码
     * @return 结果
     */
    @Override
    public int updateEducation(Education education)
    {
        return educationMapper.updateEducation(education);
    }

    /**
     * 删除学历编码对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEducationByIds(String ids)
    {
        return educationMapper.deleteEducationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学历编码信息
     * 
     * @param eduId 学历编码ID
     * @return 结果
     */
    @Override
    public int deleteEducationById(String eduId)
    {
        return educationMapper.deleteEducationById(eduId);
    }
}
