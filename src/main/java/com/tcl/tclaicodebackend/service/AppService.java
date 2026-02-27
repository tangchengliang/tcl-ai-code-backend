package com.tcl.tclaicodebackend.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.tcl.tclaicodebackend.model.dto.app.AppQueryRequest;
import com.tcl.tclaicodebackend.model.entity.App;
import com.tcl.tclaicodebackend.model.entity.User;
import com.tcl.tclaicodebackend.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/tangchengliang">程序员 小南瓜</a>
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);
}
