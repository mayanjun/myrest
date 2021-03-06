/*
 * Copyright 2016-2018 mayanjun.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mayanjun.myrest.session;

/**
 * 表示一个WEB登录用户
 * @author mayanjun
 * @since 2018/7/19
 */
public class SessionUser<T> {

    public SessionUser() {
    }

    public SessionUser(Long id) {
        this.id = id;
    }

    public SessionUser(SessionUser user) {
        this(user.username);
    }

    public SessionUser(String username) {
        this.username = username;
        this.lastLoginTime = System.currentTimeMillis();
    }

    private T originUser;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码，须采用加密存储
     */
    private String password;

    /**
     * 描述
     */
    private String description;

    /**
     * 用户最后一次登录时间
     */
    private long lastLoginTime;

    /**
     * 用户TOKEN
     */
    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public T getOriginUser() {
        return originUser;
    }

    public void setOriginUser(T originUser) {
        this.originUser = originUser;
    }
}
