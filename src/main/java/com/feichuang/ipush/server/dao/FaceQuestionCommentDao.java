package com.feichuang.ipush.server.dao;

import org.apache.ibatis.annotations.SelectProvider;

import tk.mybatis.mapper.common.Mapper;

import com.feichuang.ipush.server.common.model.FaceQuestionComment;
import com.feichuang.ipush.server.provider.FaceQuestionProvider;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface FaceQuestionCommentDao extends Mapper<FaceQuestionComment> {

    @SelectProvider(type = FaceQuestionProvider.class, method = "page")
    PageList<FaceQuestionComment> page(FaceQuestionComment param,
            PageBounds pageBounds);

}
