package cn.vcorp.ghrm.emp.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.annotation.Log;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.common.core.page.TableDataInfo;
import cn.vcorp.ghrm.common.enums.BusinessType;
import cn.vcorp.ghrm.common.utils.poi.ExcelUtil;
import cn.vcorp.ghrm.emp.domain.Ethnic;
import cn.vcorp.ghrm.emp.service.IEthnicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * 民族Controller
 * @author administrator
 * @date 2023-04-25
 */
@Anonymous
@RestController
@RequestMapping("/emp/ethnic")
public class EthnicController extends BaseController
{
    private String prefix = "empEthnic";

    @Autowired
    private IEthnicService ethnicService;

    //@RequiresPermissions("system:emp:view")
    @GetMapping()
    public String ethnic()
    {
        return prefix + "访问";
    }

    @GetMapping("/list")
    public String ethnicList()
    {
        System.out.println("收到get/list请求");
        return prefix + "访问list";
    }
    /**
     * 查询民族列表
     */
    //@RequiresPermissions("system:emp:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ethnic ethnic)
    {
        //控制台输出“收到/list请求”
        System.out.println("收到post/list请求");
        //startPage();
        List<Ethnic> list = ethnicService.selectEthnicList(ethnic);
        //控制台输出“list.size()”的值
        //控制台输出“获取民族列表大小：”
        System.out.println("获取民族列表大小：");
        System.out.println(list.size());
        return getDataTable(list);
    }

    /**
     * 导出民族列表
     */
    //@RequiresPermissions("system:emp:export")
    @Log(title = "民族", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ethnic ethnic)
    {
        List<Ethnic> list = ethnicService.selectEthnicList(ethnic);
        ExcelUtil<Ethnic> util = new ExcelUtil<Ethnic>(Ethnic.class);
        return util.exportExcel(list, "emp-ethnic");
    }

    /**
     * 新增民族
     * get访问/emp/ethnic/add
     * 跳转到添加民族页面
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存民族
     */
    //@RequiresPermissions("system:emp:add")
    //@Log(title = "民族", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ethnic ethnic)
    {
        return toAjax(ethnicService.insertEthnic(ethnic));
    }

    /**
     * 修改民族页面
     */
    @GetMapping("/edit/{ethnicId}")
    public String edit(@PathVariable("ethnicId") String ethnicId, ModelMap mmap)
    {
        Ethnic ethnic = ethnicService.selectEthnicById(ethnicId);
        mmap.put("ethnic", ethnic);
        return prefix + "/edit";
    }

    /**
     * 修改保存民族
     */
    //@RequiresPermissions("system:emp:edit")
    //@Log(title = "民族", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ethnic ethnic)
    {
        return toAjax(ethnicService.updateEthnic(ethnic));
    }

    /**
     * 删除多个民族
     */
    //@RequiresPermissions("system:emp:remove")
    //@Log(title = "民族", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ethnicService.deleteEthnicByIds(ids));
    }

    /**
     * 删除单个民族
     */
    //@RequiresPermissions("system:emp:remove")
    //@Log(title = "民族", businessType = BusinessType.DELETE)
    @PostMapping( "/removeOne")
    @ResponseBody
    public AjaxResult removeOne(String ethnicId)
    {
        return toAjax(ethnicService.deleteEthnicById(ethnicId));
    }
}
