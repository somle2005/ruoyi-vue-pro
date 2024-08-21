package com.somle.esb.converter;

import com.somle.dingtalk.model.DingTalkDepartment;
import com.somle.dingtalk.service.DingTalkService;
import com.somle.erp.model.ErpDepartment;
import com.somle.erp.service.ErpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Slf4j
@Service
public class DingTalkToErpConverter {
    @Autowired
    DingTalkService dingTalkService;

    @Autowired
    ErpService erpService;

    public ErpDepartment toEsb(DingTalkDepartment dept) {
        ErpDepartment erpDepartment = ErpDepartment.builder()
            .id(dept.getDeptId())
            .nameZh(dept.getName())
            .level(dept.getLevel())
            .parentId(dept.getParentId())
            .build();
        return erpDepartment;
    }

    public Stream<ErpDepartment> toEsbStream(ErpDepartment esbParent) {
        List<DingTalkDepartment> childList = dingTalkService.getOrphans(Long.valueOf(esbParent.getId())).toList();
        if ( childList.isEmpty()) {
            log.debug("null child list");
            return Stream.of();
        } else {
            log.debug("non null child list");
            log.debug(childList.toString());
            List<ErpDepartment> esbChildList = childList.stream().map(child->{
                ErpDepartment esbChild = toEsb(child);
                esbChild.setParent(esbParent);
                esbChild.setLevel((esbParent.getLevel() + 1));
                return esbChild;
            }).toList();
            return Stream.concat(esbChildList.stream(), esbChildList.stream().flatMap(n -> toEsbStream(n)));
            // return Stream.concat(childList.stream().filter(n->! keys.stream().anyMatch(key->n.getName().startsWith(key))), childList.stream().flatMap(n -> getDepartmentsResursive(n)));
        }
    }

    public Stream<ErpDepartment> getEsbDepartmentStream() {
        return toEsbStream(toEsb(
            DingTalkDepartment.builder()
                .deptId(1l)
                .level(0)
                .build()
        ));
    }
}
