/**
 * Copyright (c) 2015-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.service;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

/**
 * JbootService 需要 Join 功能的话，需要实现 JbootServiceJoiner 接口
 */
public interface JbootServiceJoiner {


    public <M extends Model> Page<M> join(Page<M> page, String joinOnField);

    public <M extends Model> Page<M> join(Page<M> page, String joinOnField, String[] attrs);

    public <M extends Model> Page<M> join(Page<M> page, String joinOnField, String joinName);

    public <M extends Model> Page<M> join(Page<M> page, String joinOnField, String joinName, String[] attrs);


    public <M extends Model> List<M> join(List<M> models, String joinOnField);

    public <M extends Model> List<M> join(List<M> models, String joinOnField, String[] attrs);

    public <M extends Model> List<M> join(List<M> models, String joinOnField, String joinName);

    public <M extends Model> List<M> join(List<M> models, String joinOnField, String joinName, String[] attrs);


    public <M extends Model> M join(M model, String joinOnField);

    public <M extends Model> M join(M model, String joinOnField, String[] attrs);

    public <M extends Model> M join(M model, String joinOnField, String joinName);

    public <M extends Model> M join(M model, String joinOnField, String joinName, String[] attrs);


}
