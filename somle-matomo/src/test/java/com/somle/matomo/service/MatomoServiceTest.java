package com.somle.matomo.service;

import com.somle.framework.test.core.ut.BaseMockitoUnitTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class MatomoServiceTest extends BaseMockitoUnitTest {

    MatomoService service = new MatomoService();

    @Test
    void getVisits() {
        var result = service.getVisits(3, LocalDate.of(2024, 9, 24));
        log.info(result.toList().toString());
    }


}