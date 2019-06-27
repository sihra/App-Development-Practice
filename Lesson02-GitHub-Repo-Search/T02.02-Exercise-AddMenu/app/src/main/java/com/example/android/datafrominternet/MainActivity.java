/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.datafrominternet;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mSearchBoxEditText;

    private TextView mUrlDisplayTextView;

    private TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflating the menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return true; // This will allow menu to be displayed
    }

    /**
     * Toast - provides a simple feedback about an operation in a small popup
     * Nothing changes, it automatically disappears after a certain amount of time
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selectedMenuItem = item.getItemId();
        // Checking is the menu button was clicked
        if(selectedMenuItem == R.id.action_search){
            // If the menu item's ID is the same, a Toast is shown
            Context context = MainActivity.this;
            String message = "Search clicked";
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            // Return true to let Android know that you've handled the situation/ menu click
            return true;
        }
        else{
            // If the selected menu option wasn't the menu button, Android will handle it
            return super.onOptionsItemSelected(item);
        }
    }

    // TODO (11) Override onOptionsItemSelected
    // TODO (12) Within onOptionsItemSelected, get the ID of the item that was selected
    // TODO (13) If the item's ID is R.id.action_search, show a Toast and return true to tell Android that you've handled this menu click
    // TODO (14) Don't forgot to call .show() on your Toast
    // TODO (15) If you do NOT handle the menu click, return super.onOptionsItemSelected to let Android handle the menu click
}
