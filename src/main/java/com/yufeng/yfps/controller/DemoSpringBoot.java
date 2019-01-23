package com.yufeng.yfps.controller;

import com.yufeng.yfps.model.Supplier;
import com.yufeng.yfps.service.SupplierService;
import com.yufeng.yfps.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DemoSpringBoot {
    @Autowired
    private SupplierService supplierService;

    @RequestMapping(value = "/select", produces = {"application/json;charset=UTF-8"})
    public List<Supplier> add(Supplier supplier){
        System.out.println("controller");
        List<Supplier> list = supplierService.add(supplier);

        return list;

    }
}
