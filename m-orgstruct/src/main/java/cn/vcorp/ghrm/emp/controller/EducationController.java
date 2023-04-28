package cn.vcorp.ghrm.emp.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.annotation.Log;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.common.core.page.TableDataInfo;
import cn.vcorp.ghrm.common.enums.BusinessType;
import cn.vcorp.ghrm.common.utils.poi.ExcelUtil;
import cn.vcorp.ghrm.emp.domain.Education;
import cn.vcorp.ghrm.emp.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学历编码Controller
 * 
 * @author administrator
 * @date 2023-04-27
 */

@Anonymous
@RestController
@RequestMapping("/mapper/emp/education")
public class EducationController extends BaseController
{
    private String prefix = "mapper/emp/education";

    @Autowired
    private IEducationService educationService;

    //@RequiresPermissions("emp:education:view")
    @GetMapping()
    public String education()
    {
        return prefix + "/education";
    }

    /**
     * 查询学历编码列表
     */
    //@RequiresPermissions("emp:education:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Education education)
    {
        startPage();
        List<Education> list = educationService.selectEducationList(education);
        return getDataTable(list);
    }

    /**
     * 导出学历编码列表
     */
    //@RequiresPermissions("emp:education:export")
    @Log(title = "学历编码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Education education)
    {
        List<Education> list = educationService.selectEducationList(education);
        ExcelUtil<Education> util = new ExcelUtil<Education>(Education.class);
        return util.exportExcel(list, "education");
    }

    /**
     * 新增学历编码
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学历编码
     */
    //@RequiresPermissions("emp:education:add")
    //@Log(title = "学历编码", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Education education)
    {
        return toAjax(educationService.insertEducation(education));
    }

    /**
     * 修改学历编码
     */
    @GetMapping("/edit/{eduId}")
    public String edit(@PathVariable("eduId") String eduId, ModelMap mmap)
    {
        Education education = educationService.selectEducationById(eduId);
        mmap.put("education", education);
        return prefix + "/edit";
    }

    /**
     * 修改保存学历编码
     */
    //@RequiresPermissions("emp:education:edit")
    //@Log(title = "学历编码", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Education education)
    {
        return toAjax(educationService.updateEducation(education));
    }

    /**
     * 删除学历编码
     */
    //@RequiresPermissions("emp:education:remove")
    //@Log(title = "学历编码", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(educationService.deleteEducationByIds(ids));
    }
}
