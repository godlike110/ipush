package com.feichuang.ipush.server.provider;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import com.feichuang.ipush.server.common.model.FaceQuestion;

public class FaceQuestionProvider {

    private final static String TABLE_NAME = " face_question ";

    public String page(final FaceQuestion param) {
        SQL sql = new SQL() {
            {
                this.SELECT("*");
                this.FROM(FaceQuestionProvider.TABLE_NAME);
                this.WHERE("1 = 1");
                if (StringUtils.isNotEmpty(param.getTag())) {
                    this.AND().WHERE("tag = #{tag}");
                }
            }
        };
        return sql.toString();
    }
}
