package cn.vcorp.ghrm.emp.service;

import cn.vcorp.ghrm.emp.domain.Ethnic;

import java.util.List;
/**
 * 民族Service接口
 * 
 * @author administrator
 * @date 2023-04-25
 */
public interface IEthnicService 
{
    /**
     * 查询民族
     * 
     * @param ethnicId 民族ID
     * @return 民族
     */
    public Ethnic selectEthnicById(String ethnicId);

    /**
     * 查询民族列表
     * 
     * @param ethnic 民族
     * @return 民族集合
     */
    public List<Ethnic> selectEthnicList(Ethnic ethnic);

    /**
     * 新增民族
     * 
     * @param ethnic 民族
     * @return 结果
     */
    public int insertEthnic(Ethnic ethnic);

    /**
     * 修改民族
     * 
     * @param ethnic 民族
     * @return 结果
     */
    public int updateEthnic(Ethnic ethnic);

    /**
     * 批量删除民族
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEthnicByIds(String ids);

    /**
     * 删除民族信息
     * 
     * @param ethnicId 民族ID
     * @return 结果
     */
    public int deleteEthnicById(String ethnicId);
}
