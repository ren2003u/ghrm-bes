package cn.vcorp.ghrm.orgstruct.controller;

import cn.vcorp.ghrm.common.annotation.Anonymous;
import cn.vcorp.ghrm.common.core.controller.BaseController;
import cn.vcorp.ghrm.common.core.domain.AjaxResult;
import cn.vcorp.ghrm.orgstruct.domain.OrgStaffing;
import cn.vcorp.ghrm.orgstruct.service.IOrgStaffingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Anonymous
@RequestMapping("/orgStaffing")
public class OrgStaffingController extends BaseController {

    @Autowired
    private IOrgStaffingService orgStaffingService;

    //@PreAuthorize("@ss.hasPermi('system:orgStaffing:create')")
    @PostMapping("/create")
    public AjaxResult create(@RequestBody OrgStaffing orgStaffing) {
        int result = orgStaffingService.createOrgStaffing(orgStaffing);
        return toAjax(result);
    }

    //@PreAuthorize("@ss.hasPermi('system:orgStaffing:delete')")
    @DeleteMapping("/delete/{os_id}")
    public AjaxResult delete(@PathVariable("os_id") String os_id) {
        int result = orgStaffingService.deleteOrgStaffing(os_id);
        return toAjax(result);
    }

    //@PreAuthorize("@ss.hasPermi('system:orgStaffing:update')")
    @PutMapping("/update")
    public AjaxResult update(@RequestBody OrgStaffing orgStaffing) {
        int result = orgStaffingService.updateOrgStaffing(orgStaffing);
        return toAjax(result);
    }

    // Get all organization staffings
    //@PreAuthorize("@ss.hasPermi('system:orgStaffing:list')")
    @GetMapping("/list")
    public AjaxResult listAll() {
        List<OrgStaffing> orgStaffings = orgStaffingService.getAllOrgStaffings();
        return AjaxResult.success(orgStaffings);
    }

    // Get organization staffing by os_id
    //@PreAuthorize("@ss.hasPermi('system:orgStaffing:get')")
    @GetMapping("/get/{os_id}")
    public AjaxResult getOrgStaffingById(@PathVariable("os_id") String os_id) {
        OrgStaffing orgStaffing = orgStaffingService.getOrgStaffingById(os_id);
        return AjaxResult.success(orgStaffing);
    }
}