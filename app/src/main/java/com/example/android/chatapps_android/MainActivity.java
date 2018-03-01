package com.example.android.chatapps_android;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.mikepenz.iconics.context.IconicsLayoutInflater2;

import org.json.JSONObject;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    CallbackManager callbackManager;
    GraphRequest graphRequest;
    com.facebook.login.LoginManager fbLoginManager;
    Button bLogin;

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //new activity from login page
    public void chatbox (View view){
        final Intent intent = new Intent(this, tabviewChatbox.class);
        fbLoginManager = com.facebook.login.LoginManager.getInstance();
        callbackManager = CallbackManager.Factory.create();

        bLogin = (Button) findViewById(R.id.bLogin);

        //only start activity if login success
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                graphRequest(loginResult.getAccessToken());
                startActivity(intent);
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager.getInstance().logInWithReadPermissions(MainActivity.this, Arrays.asList("public_profile", "email", "user_birthday", "user_friends"));
            }
        });
    }

    public void graphRequest(AccessToken accessToken) {
        graphRequest = GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(JSONObject object, GraphResponse response) {
                Log.d("response", response.toString());
            }
        });

        Bundle parameters = new Bundle();
        parameters.putString("fields", "id,email,birthday,friends");
        graphRequest.setParameters(parameters);
        graphRequest.executeAsync();
    }

    //Function calling for integration of font awesome, can directly put icon inside default button by typing name
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(IconicsContextWrapper.wrap(newBase));
    }
}