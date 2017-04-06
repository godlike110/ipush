package com.feichuang.ipush.server.controller;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.feichuang.ipush.server.common.model.FaceQuestion;
import com.feichuang.ipush.server.common.model.FaceQuestionComment;
import com.feichuang.ipush.server.common.model.req.FaceQuestionReq;
import com.feichuang.ipush.server.dao.FaceQuestionCommentDao;
import com.feichuang.ipush.server.dao.FaceQuestionDao;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

@Controller
@RequestMapping("")
public class FaceQuestionDealController {

    @Autowired
    private FaceQuestionDao faceQuestionDao;
    @Autowired
    private FaceQuestionCommentDao faceQuestionCommentDao;

    /**
     * 获取列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "getFaceQuestionByPage", method = RequestMethod.GET)
    @ResponseBody
    public String getFaceQuestionByPage(@RequestBody FaceQuestionReq req) {
        PageBounds bounds = new PageBounds(req.getPage(), req.getLimit());
        PageList<FaceQuestion> result = this.faceQuestionDao.page(req, bounds);
        return JSON.toJSONString(result);
    }

    /**
     * 获取题目详情,包括对应的评论
     * 
     * @param req
     * @return
     */
    @RequestMapping(value = "getDetail", method = RequestMethod.GET)
    @ResponseBody
    public String index(@RequestBody FaceQuestionReq req) {
        FaceQuestion question = this.faceQuestionDao.selectByPrimaryKey(req
            .getId());

        Map<String, Object> result = new HashedMap();
        result.put("detail", question);
        FaceQuestionComment commentParam = new FaceQuestionComment();
        commentParam.setQuestionId(req.getId());

        PageBounds bounds = new PageBounds(1, 100);
        PageList<FaceQuestionComment> comments = this.faceQuestionCommentDao
                .page(commentParam, bounds);
        result.put("comments", comments);

        return JSON.toJSONString(result);
    }
}
