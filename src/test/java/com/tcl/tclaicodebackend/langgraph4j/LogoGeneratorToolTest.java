package com.tcl.tclaicodebackend.langgraph4j;
import com.tcl.tclaicodebackend.langgraph4j.enums.ImageCategoryEnum;
import com.tcl.tclaicodebackend.langgraph4j.model.ImageResource;
import com.tcl.tclaicodebackend.langgraph4j.tools.ImageSearchTool;
import com.tcl.tclaicodebackend.langgraph4j.tools.LogoGeneratorTool;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LogoGeneratorToolTest {

// 暂时注释
//    @Resource
//    private LogoGeneratorTool logoGeneratorTool;
//
//    @Test
//    void testGenerateLogos() {
//        // 测试生成Logo
//        List<ImageResource> logos = logoGeneratorTool.generateLogos("技术公司现代简约风格Logo");
//        assertNotNull(logos);
//        ImageResource firstLogo = logos.getFirst();
//        assertEquals(ImageCategoryEnum.LOGO, firstLogo.getCategory());
//        assertNotNull(firstLogo.getDescription());
//        assertNotNull(firstLogo.getUrl());
//        logos.forEach(logo ->
//                System.out.println("Logo: " + logo.getDescription() + " - " + logo.getUrl())
//        );
//    }
}
