package pms.modules.pms.dao;

import pms.modules.pms.entity.PmTeamInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 团队信息
 * 
 * @author mikey
 * @email biaogejiushibiao@gmail.com
 * @date 2019-11-27 17:34:06
 */
@Mapper
public interface PmTeamInfoDao extends BaseMapper<PmTeamInfoEntity> {

    PmTeamInfoEntity findById(Integer teamId);

    List<PmTeamInfoEntity> findByItemId(Integer itemInfoId);
}
