package org.linlinjava.litemall.admin.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.linlinjava.litemall.admin.service.AdminOrderService;
import org.linlinjava.litemall.core.express.ExpressService;
import org.linlinjava.litemall.core.notify.NotifyService;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.core.validator.Order;
import org.linlinjava.litemall.core.validator.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Liyi
 * @version 1.0
 * @ClassName AppOrderController
 * @description
 * @date 2023/4/15 19:18
 */

@RestController
@RequestMapping("/wx/order")
@Validated
@Slf4j
public class AppOrderController {
    private final Log logger = LogFactory.getLog(AdminOrderController.class);

    @Autowired
    private AdminOrderService adminOrderService;
    @Autowired
    private ExpressService expressService;

    /**
     * 发货
     *
     * @param body 订单信息，{ orderId：xxx, shipSn: xxx, shipChannel: xxx }
     * @return 订单操作结果
     */
    @RequiresPermissions("admin:order:ship")
    @RequiresPermissionsDesc(menu = {"商场管理", "订单管理"}, button = "订单发货")
    @PostMapping("/ship")
    public Object ship(@RequestBody String body) {
        log.debug("段三--段三--段三--段三--段三--段三--");
        return adminOrderService.ship(body);
    }

    @RequiresPermissions("admin:order:pay")
    @RequiresPermissionsDesc(menu = {"商场管理", "订单管理"}, button = "订单收款")
    @PostMapping("/pay")
    public Object pay(@RequestBody String body) {
        return adminOrderService.pay(body);
    }

}
