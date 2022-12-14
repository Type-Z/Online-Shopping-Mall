package com.iflytek.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iflytek.gulimall.common.utils.PageUtils;
import com.iflytek.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author rclin
 * @email rclin@iflytek.com
 * @date 2020-06-07 11:15:53
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

