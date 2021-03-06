package spring.guides.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import spring.guides.dubbo.service.DemoService;
import spring.guides.dubbo.service.DubboAnnotationService;

/**
 * Dubbo 注解服务实现。
 *
 * @author dannong
 * @since 2017年10月04日
 */
@Service("dubboAnnotationService")
public class DubboAnnotationServiceImpl implements DubboAnnotationService {

  /**
   * 消费服务
   * obtain proxy object for remote invocation
   */
  @Reference(interfaceClass = DemoService.class)
  private DemoService demoService;

  @Override
  public String sayHello(String name) {
    // execute remote invocation
    return demoService.sayHello(name);
  }

}
