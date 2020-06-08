package pms.modules.pms.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pms.common.utils.PageUtils;
import pms.common.utils.Query;

import pms.modules.pms.dao.PmFundInfoDao;
import pms.modules.pms.entity.PmFundInfoEntity;
import pms.modules.pms.service.PmFundInfoService;


@Service("pmFundInfoService")
public class PmFundInfoServiceImpl extends ServiceImpl<PmFundInfoDao, PmFundInfoEntity> implements PmFundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmFundInfoEntity> page = this.page(
                new Query<PmFundInfoEntity>().getPage(params),
                new QueryWrapper<PmFundInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PmFundInfoEntity findByItemInfoId(Integer itemInfoId) {


        QueryWrapper ew = new QueryWrapper<PmFundInfoEntity>().setEntity(new PmFundInfoEntity());

        ew.eq("item_info_id", itemInfoId);

        return super.getOne(ew);
    }
}