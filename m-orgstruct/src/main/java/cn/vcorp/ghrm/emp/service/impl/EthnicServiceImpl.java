package cn.vcorp.ghrm.emp.service.impl;

import cn.vcorp.ghrm.common.core.text.Convert;
import cn.vcorp.ghrm.emp.domain.Ethnic;
import cn.vcorp.ghrm.emp.mapper.EthnicMapper;
import cn.vcorp.ghrm.emp.service.IEthnicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 民族Service业务层处理
 * 
 * @author administrator
 * @date 2023-04-25
 */
@Service
public class EthnicServiceImpl implements IEthnicService 
{
    @Autowired
    private EthnicMapper ethnicMapper;

    /**
     * 查询民族
     * 
     * @param ethnicId 民族ID
     * @return 民族
     */
    @Override
    public Ethnic selectEthnicById(String ethnicId)
    {
        return ethnicMapper.selectEthnicById(ethnicId);
    }

    /**
     * 查询民族列表
     * 
     * @param ethnic 民族
     * @return 民族
     */
    @Override
    public List<Ethnic> selectEthnicList(Ethnic ethnic)
    {
        //显示当前路径
        System.out.println("m-admin/emp/EthnicServiceImpl.selectEthnicList");
        return ethnicMapper.selectEthnicList(ethnic);
        //return ethnicMapper.selectEthnicVo();
    }

    /**
     * 新增民族
     * 
     * @param ethnic 民族
     * @return 结果
     */
    @Override
    public int insertEthnic(Ethnic ethnic)
    {
        return ethnicMapper.insertEthnic(ethnic);
    }

    /**
     * 修改民族
     * 
     * @param ethnic 民族
     * @return 结果
     */
    @Override
    public int updateEthnic(Ethnic ethnic)
    {
        //输出传入的信息
        System.out.println("传入的修改信息："+ethnic);
        return ethnicMapper.updateEthnic(ethnic);
    }

    /**
     * 删除民族对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEthnicByIds(String ids)
    {
        return ethnicMapper.deleteEthnicByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除民族信息
     * 
     * @param ethnicId 民族ID
     * @return 结果
     */
    @Override
    public int deleteEthnicById(String ethnicId)
    {
        //输出调用信息
        //System.out.println("调用ethnicMapper.deleteEthnicBuId");
        //输出ethnicId值
        //System.out.println("ethnicId:"+ethnicId);
        return ethnicMapper.deleteEthnicById(ethnicId);
    }
}
