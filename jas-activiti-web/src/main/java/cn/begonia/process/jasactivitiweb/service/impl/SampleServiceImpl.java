package cn.begonia.process.jasactivitiweb.service.impl;

import cn.begonia.process.jasactivitiweb.mapper.SampleMapper;
import cn.begonia.process.jasactivitiweb.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *     系统用户服务实现
 * </p>
 *
 * @author liujixiang
 * @since 2018/12/28
 */
//@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleMapper  sampleMapper;


}
