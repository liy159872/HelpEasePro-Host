package com.oddfar.campus.business.mapper;

import com.oddfar.campus.business.domain.entity.ContentEntity;
import com.oddfar.campus.business.domain.vo.ContentVo;
import com.oddfar.campus.common.core.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContentMapper extends BaseMapperX<ContentEntity> {
    /**
     * 查询HelpEasePro内容列表
     *
     * @param content HelpEasePro内容
     * @return HelpEasePro内容集合
     */
    List<ContentVo> selectContentList(ContentEntity content);

    /**
     * 查询HelpEasePro内容
     *
     * @param contentEntity HelpEasePro内容参数
     * @return HelpEasePro内容
     */
    ContentVo selectContentByContent(ContentEntity contentEntity);

    List<ContentVo> selectContentByIds(@Param("contentIdList") List<Long> contentIdList);

    /**
     * 查询某用户的点赞信息墙ID列表
     *
     * @param userId
     * @return
     */
    List<Long> selectLoveContentList(@Param("userId") Long userId);

    /**
     * 查询热门信息墙内容列表（热度根据点赞高低判断）
     * @return
     */
    List<ContentEntity> getSimpleHotContent();
}




