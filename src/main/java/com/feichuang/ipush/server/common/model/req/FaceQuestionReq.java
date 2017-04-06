package com.feichuang.ipush.server.common.model.req;

import com.feichuang.ipush.server.common.model.FaceQuestion;

public class FaceQuestionReq extends FaceQuestion {

    private int page;
    private int limit;

    public int getPage() {
        if (this.page < 1) {
            return 1;
        }
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        if (this.limit > 100) {
            return 20;
        }
        if (this.limit < 1) {
            return 1;
        }
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
