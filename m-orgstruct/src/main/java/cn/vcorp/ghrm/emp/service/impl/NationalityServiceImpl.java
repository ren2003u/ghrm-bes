package cn.vcorp.ghrm.emp.service.impl;

import cn.vcorp.ghrm.common.core.text.Convert;
import cn.vcorp.ghrm.emp.domain.Nationality;
import cn.vcorp.ghrm.emp.mapper.NationalityMapper;
import cn.vcorp.ghrm.emp.service.INationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 国籍Service业务层处理
 * 
 * @author administrator
 * @date 2023-04-26
 */
@Service
public class NationalityServiceImpl implements INationalityService 
{
    @Autowired
    private NationalityMapper nationalityMapper;

    /**
     * 查询国籍
     * 
     * @param nationId 国籍ID
     * @return 国籍
     */
    @Override
    public Nationality selectNationalityById(String nationId)
    {
        return nationalityMapper.selectNationalityById(nationId);
    }

    /**
     * 查询国籍列表
     * 
     * @param nationality 国籍
     * @return 国籍
     */
    @Override
    public List<Nationality> selectNationalityList(Nationality nationality)
    {
        return nationalityMapper.selectNationalityList(nationality);
    }

    /**
     * 新增国籍
     * 
     * @param nationality 国籍
     * @return 结果
     */
    @Override
    public int insertNationality(Nationality nationality)
    {
        return nationalityMapper.insertNationality(nationality);
    }

    /**
     * 修改国籍
     * 
     * @param nationality 国籍
     * @return 结果
     */
    @Override
    public int updateNationality(Nationality nationality)
    {
        return nationalityMapper.updateNationality(nationality);
    }

    /**
     * 删除国籍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNationalityByIds(String ids)
    {
        return nationalityMapper.deleteNationalityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除国籍信息
     * 
     * @param nationId 国籍ID
     * @return 结果
     */
    @Override
    public int deleteNationalityById(String nationId)
    {
        return nationalityMapper.deleteNationalityById(nationId);
    }
}
