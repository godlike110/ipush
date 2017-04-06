package com.feichuang.ipush.server.provider;

import org.apache.ibatis.jdbc.SQL;

import com.feichuang.ipush.server.common.model.FaceQuestionComment;

public class FaceQuestionCommentProvider {

    private final static String TABLE_NAME = " face_question_comment ";

    public String page(final FaceQuestionComment param) {
        SQL sql = new SQL() {
            {
                this.SELECT("*");
                this.FROM(FaceQuestionCommentProvider.TABLE_NAME);
                this.WHERE("1 = 1");
                if (param.getQuestionId() != 0) {
                    this.AND().WHERE("questionId = #{questionId}");
                }
            }
        };
        return sql.toString();
    }
}
