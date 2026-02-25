package com.tcl.tclaicodebackend.ai;

import com.tcl.tclaicodebackend.ai.model.HtmlCodeResult;
import com.tcl.tclaicodebackend.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult htmlCodeResult = aiCodeGeneratorService.generateHtmlCode("做个小南瓜的工作记录小工具，不超过20行");
        Assertions.assertNotNull(htmlCodeResult);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult multiFileCodeResult = aiCodeGeneratorService.generateMultiFileCode("做个小南瓜的留言板，不超过20行");
        Assertions.assertNotNull(multiFileCodeResult);
    }
}
