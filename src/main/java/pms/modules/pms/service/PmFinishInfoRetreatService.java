package pms.modules.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pms.common.utils.PageUtils;
import pms.modules.pms.entity.PmFinishInfoRetreatEntity;

import java.util.Map;

/**
 * 结题回退表
 *
 * @author mikey
 * @email biaogejiushibiao@gmail.com
 * @date 2019-12-03 16:46:48
 */
public interface PmFinishInfoRetreatService extends IService<PmFinishInfoRetreatEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

