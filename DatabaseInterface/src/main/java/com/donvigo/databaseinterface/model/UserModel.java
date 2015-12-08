/*
 *    Copyright 2015 Veaceslav Gaidarji
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.donvigo.databaseinterface.model;

/**
 * Created by vgaidarji on 8/14/15.
 */
public interface UserModel {
    int getId();
    String getName();
    String getAddress();
    String getSsn();
    String getEmail();
    String getHomePhone();
    String getWorkPhone();
    void setId(int id);
    void setName(String name);
    void setAddress(String address);
    void setSsn(String ssn);
    void setEmail(String email);
    void setHomePhone(String homePhone);
    void setWorkPhone(String workPhone);
}
