package cn.cecurio.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author: Cecurio
 * @create: 2017-10-16 14:30
 * @desc:
 **/
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
