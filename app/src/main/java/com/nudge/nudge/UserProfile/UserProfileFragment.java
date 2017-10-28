package com.nudge.nudge.UserProfile;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nudge.nudge.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.app.Activity.RESULT_OK;

/**
 * Created by rushabh on 06/10/17.
 */

public class UserProfileFragment extends Fragment {

    private static final String TAG = "UserProfielFragment";

    @BindView(R.id.profile_signoutButton)
    Button mSignOutButton;

    public UserProfileFragment(){
        //Empty Constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_userprofile, container, false);
        rootView.setTag(TAG);

        ButterKnife.bind(this,rootView);

        mSignOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent=new Intent();
//                intent.putExtra("SignOut","Yes");
//                getContext().setResult(RESULT_OK,intent);
//                finish();
            }
        });


        return rootView;

    }


}
