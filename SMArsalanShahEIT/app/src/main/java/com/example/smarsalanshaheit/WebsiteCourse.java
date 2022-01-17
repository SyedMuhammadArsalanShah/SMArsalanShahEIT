package com.example.smarsalanshaheit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WebsiteCourse#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class WebsiteCourse extends Fragment {
View view; WebView webView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WebsiteCourse.
     */
    // TODO: Rename and change types and number of parameters
    public static WebsiteCourse newInstance(String param1, String param2) {
        WebsiteCourse fragment = new WebsiteCourse();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public WebsiteCourse() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    view=    inflater.inflate(R.layout.fragment_website_course, container, false);
        webView =view.findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/SyedMuhammadArsalanShah/WebsiteDevelopmentCourse");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        return view;



    }
}