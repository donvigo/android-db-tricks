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

package com.donvigo.ormlitedatabase.migration;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.donvigo.ormlitedatabase.model.User;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Creates tables in empty database.
 */
public class M00 extends Migration {
    @Override
    public void migrate(SQLiteDatabase db, ConnectionSource src)
            throws SQLException {
        createTables(src);
    }

    private void createTables(ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, User.class);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    private void dropTables(ConnectionSource connectionSource) {
    }
}