package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.SelectProvider;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.FaceQuestion;
import com.feichuang.ipush.server.provider.FaceQuestionProvider;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * 面试题
 *
 * @author junze
 */
public interface FaceQuestionDao extends Mapper<FaceQuestion> {

    @SelectProvider(type = FaceQuestionProvider.class, method = "page")
    PageList<FaceQuestion> page(FaceQuestion param, PageBounds pageBounds);

}
