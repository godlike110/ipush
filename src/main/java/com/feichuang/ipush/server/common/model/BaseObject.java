package com.feichuang.ipush.server.common.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by wenzhiwei on 17-3-15.
 */
public class BaseObject implements Serializable {

    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private static final long serialVersionUID = 2744190391613295958L;

    /**
     * <p>
     * toString.
     * </p>
     *
     * @return a {@link String} object.
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object object) {
        return EqualsBuilder.reflectionEquals(this, object);
    }

    /**
     * <p>
     * hashCode.
     * </p>
     *
     * @return a int.
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
