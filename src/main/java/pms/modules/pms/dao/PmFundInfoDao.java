package pms.modules.pms.dao;

import pms.modules.pms.entity.PmFundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 经费预算/实际支出信息表
 * 
 * @author mikey
 * @email biaogejiushibiao@gmail.com
 * @date 2019-11-27 17:34:06
 */
@Mapper
public interface PmFundInfoDao extends BaseMapper<PmFundInfoEntity> {
	
}
