/*
 *  Copyright 2020 http://www.hswebframework.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package org.hswebframework.web.authorization.oauth2.server.support.code;

import java.util.Set;

/**
 *
 * @author zhouhao
 */
public interface AuthorizationCode {
    String getClientId();

    void setClientId(String clientId);

    String getUserId();

    void setUserId(String userId);

    String getCode();

    void setCode(String code);

    Long getCreateTime();

    void setCreateTime(Long createTime);

    Set<String> getScope();

    void setScope(Set<String> scope);

    String getRedirectUri();

    void setRedirectUri(String redirectUri);
}
