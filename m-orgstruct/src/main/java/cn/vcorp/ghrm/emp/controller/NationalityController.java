package cn.vcorp.ghrm.emp.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.common.core.page.TableDataInfo;
import cn.vcorp.ghrm.common.utils.poi.ExcelUtil;
import cn.vcorp.ghrm.emp.domain.Nationality;
import cn.vcorp.ghrm.emp.service.INationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 国籍Controller
 * 
 * @author administrator
 * @date 2023-04-26
 */
@Anonymous
@RestController
@RequestMapping("/mapper/emp/nationality")
public class NationalityController extends BaseController
{
    private String prefix = "mapper/emp/nationality";

    @Autowired
    private INationalityService nationalityService;

    //@RequiresPermissions("emp:nationality:view")
    @GetMapping()
    public String nationality()
    {
        return prefix + "/nationality";
    }

    /**
     * 查询国籍列表
     */
    //@RequiresPermissions("emp:nationality:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Nationality nationality)
    {
        startPage();
        List<Nationality> list = nationalityService.selectNationalityList(nationality);
        return getDataTable(list);
    }

    /**
     * 导出国籍列表
     */
    //@RequiresPermissions("emp:nationality:export")
    //@Log(title = "国籍", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Nationality nationality)
    {
        List<Nationality> list = nationalityService.selectNationalityList(nationality);
        ExcelUtil<Nationality> util = new ExcelUtil<Nationality>(Nationality.class);
        return util.exportExcel(list, "nationality");
    }

    /**
     * 新增国籍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存国籍
     */
    //@RequiresPermissions("emp:nationality:add")
    //@Log(title = "国籍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Nationality nationality)
    {
        return toAjax(nationalityService.insertNationality(nationality));
    }

    /**
     * 修改国籍
     */
    @GetMapping("/edit/{nationId}")
    public String edit(@PathVariable("nationId") String nationId, ModelMap mmap)
    {
        Nationality nationality = nationalityService.selectNationalityById(nationId);
        mmap.put("nationality", nationality);
        return prefix + "/edit";
    }

    /**
     * 修改保存国籍
     */
    //@RequiresPermissions("emp:nationality:edit")
    //@Log(title = "国籍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Nationality nationality)
    {
        return toAjax(nationalityService.updateNationality(nationality));
    }

    /**
     * 删除国籍
     */
    //@RequiresPermissions("emp:nationality:remove")
    //@Log(title = "国籍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nationalityService.deleteNationalityByIds(ids));
    }
}
