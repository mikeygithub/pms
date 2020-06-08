package pms.modules.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pms.common.utils.PageUtils;
import pms.modules.pms.entity.PmFinishAttachEntity;

import java.util.Map;

/**
 * 结题附件
 *
 * @author mikey
 * @email biaogejiushibiao@gmail.com
 * @date 2019-11-27 17:34:06
 */
public interface PmFinishAttachService extends IService<PmFinishAttachEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PmFinishAttachEntity findByFinishId(Integer finishInfoId);
}

