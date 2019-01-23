package com.yufeng.yfps.service.impl;

import com.yufeng.yfps.mapper.SupplierMapper;
import com.yufeng.yfps.model.Supplier;
import com.yufeng.yfps.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "supplierService")
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public List<Supplier> add(Supplier supplier) {
        System.out.println("service");
        return supplierMapper.selectall();
    }
}
